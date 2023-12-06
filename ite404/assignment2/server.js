const express = require('express');
const session = require('express-session');
const mysql = require('mysql');
const app = express();
const port = process.env.PORT || 3000;

app.set('view engine', 'ejs');
app.use(express.static('public'));
app.use(session({
    secret: 'your-secret-key',
    resave: false,
    saveUninitialized: false,
}));
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Set up MySQL connection
var connection = mysql.createConnection({
    host: '127.0.0.1',
    user: 'auis',
    password: 'auis123',
    database: 'ite404'

})

connection.connect((err) => {
    if (err) {
        console.error('Error connecting to MySQL:', err);
    } else {
        console.log('Connected to MySQL');
    }
});

const usersTable = 'users';
const tasksTable = 'tasks';


function requireAuthentication(req, res, next) {
    if (req.session.user) {
        next();
    } else {
        res.redirect('/login');
    }
}

app.get('/', requireAuthentication, (req, res) => {
    const user = req.session.user;

    // Fetch tasks from the database based on the user ID
    connection.query('SELECT * FROM ?? WHERE user_id = ?', [tasksTable, user.id], (err, results) => {
        if (err) {
            console.error('Error fetching tasks from MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else {
            res.render('todo', { user, tasks: results });
        }
    });
});

app.get('/login', (req, res) => {
    res.render('login');
});

app.post('/login', (req, res) => {
    const { username, password } = req.body;

    // Check user credentials in the MySQL database
    connection.query('SELECT * FROM ?? WHERE username = ? AND password = ?', [usersTable, username, password], (err, results) => {
        if (err) {
            console.error('Error querying MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else if (results.length > 0) {
            const user = results[0];
            req.session.user = user;
            res.redirect('/');
        } else {
            res.redirect('/login');
        }
    });
});

app.get('/logout', (req, res) => {
    req.session.destroy(() => {
        res.redirect('/login');
    });
});

app.post('/tasks', requireAuthentication, (req, res) => {
    const user = req.session.user;
    const { title, dueDate } = req.body;

    // Insert task into the MySQL database
    connection.query('INSERT INTO ?? (user_id, title, due_date) VALUES (?, ?, ?)', [tasksTable, user.id, title, dueDate], (err) => {
        if (err) {
            console.error('Error inserting task into MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else {
            res.redirect('/');
        }
    });
});

app.post('/tasks/:index/delete', requireAuthentication, (req, res) => {
    const user = req.session.user;
    const index = parseInt(req.params.index);

    console.log(user.id);
    console.log(index);


    // Delete task from the MySQL database
    connection.query('DELETE FROM ?? WHERE user_id = ? AND id = ?', [tasksTable, user.id, index], (err) => {
        if (err) {
            console.error('Error deleting task from MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else {
            res.redirect('/');
        }
    });
});

app.post('/tasks/:index/update', requireAuthentication, (req, res) => {
    const user = req.session.user;
    const index = parseInt(req.params.index);
    const { title, dueDate } = req.body;

    // Update task in the MySQL database
    connection.query('UPDATE ?? SET title = ?, due_date = ? WHERE user_id = ? AND id = ?', [tasksTable, title, dueDate, user.id, index], (err) => {
        if (err) {
            console.error('Error updating task in MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else {
            res.redirect('/');
        }
    });
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
