// Hani Amer ha20431@auis.edu.krd       Noor Safaa ns20352@auis.edu.krd

const express = require('express');
const session = require('express-session');
const mysql = require('mysql');
const mongoose = require('mongoose');
const User = require('./models/user');
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

// Connect to MongoDB using Mongoose
const dbURI = 'mongodb+srv://hani:hani1234@cluster0.7f2zmiw.mongodb.net/ite404?retryWrites=true&w=majority';
mongoose.connect(dbURI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then((result) => app.listen(port, () => {
        console.log(`Server is running on port ${port} and connected to mangoDB`);
    }))
    .catch((err) => console.log(err));

// Setting up my up MySQL connection

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

    // selecting all of the tasks for the user, i am getting the useris from mango, and the tasks from mysql
    connection.query('SELECT * FROM ?? WHERE user_id = ?', [tasksTable, user._id.toString()], (err, results) => {
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

    // Check user credentials in the MongoDB user model
    // i got this from chatGPT
    User.findOne({ username, password })
        .exec()
        .then(foundUser => {
            if (foundUser) {
                req.session.user = foundUser;
                res.redirect('/');
            } else {
                res.redirect('/login');
            }
        })
        .catch(err => {
            console.error('Error querying MongoDB:', err);
            res.status(500).send('Internal Server Error');
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
    connection.query('INSERT INTO ?? (user_id, title, due_date) VALUES (?, ?, ?)', [tasksTable, user._id.toString(), title, dueDate], (err) => {
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

    // Delete task from the MySQL database
    connection.query('DELETE FROM ?? WHERE user_id = ? AND id = ?', [tasksTable, user._id.toString(), index], (err) => {
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
    connection.query('UPDATE ?? SET title = ?, due_date = ? WHERE user_id = ? AND id = ?', [tasksTable, title, dueDate, user._id.toString(), index], (err) => {
        if (err) {
            console.error('Error updating task in MySQL:', err);
            res.status(500).send('Internal Server Error');
        } else {
            res.redirect('/');
        }
    });
});

/*
        RESOURCES

1- ChatGPT - got the templates of nodejs and mangoDB mongoose also some debugging
2- mangoDB atlas - https://cloud.mongodb.com/
3- Net Ninja - Node.js Crash Course Tutorial #9 - MongoDB - https://www.youtube.com/watch?v=bxsemcrY4gQ


*/
