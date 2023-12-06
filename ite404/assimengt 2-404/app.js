// Yasin Ibrahim Khalil - yi19103
// Aymen Mustfa - am19169
//https://stackoverflow.com/questions/62802819/uncaught-typeerror-tasks-push-is-not-a-function
//https://stackoverflow.com/questions/71221545/req-isauthenticated-returns-true-only-after-passport-authenticate-any-other-r
//https://stackoverflow.com/questions/50706022/authenticating-with-mongodb-from-javascript-file
//https://stackoverflow.com/questions/71895447/connecting-to-mongodb-database

const express = require('express');
const app = express();
const cookieParser = require('cookie-parser');
const mysql = require('mysql');
const mongoose = require('mongoose');

app.use(express.urlencoded({ extended: true }));
app.use(cookieParser());



var db = mysql.createConnection({
    host: '127.0.0.1',
    user: 'auis',
    password: 'auis123',
    database: 'ite404'

})


db.connect(err => {
    if (err) {
        console.error('MySQL connection error: ' + err.stack);
        return;
    }
    console.log('Connected to MySQL database');
});

const dbURI = 'mongodb+srv://hani:hani1234@cluster0.7f2zmiw.mongodb.net/ite404?retryWrites=true&w=majority';
mongoose.connect(dbURI, {
    useNewUrlParser: true,
    useUnifiedTopology: true
});
const User = mongoose.model('User', {
    username: String,
    password: String
});

const tasks = [];

function isAuthenticated(req, res, next) {
    if (req.cookies.user) {
        next();
    } else {
        res.redirect('/login');
    }
}

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
    res.render('login');
});

app.post('/login', async (req, res) => {
    const { username, password } = req.body;

    // MongoDB check for user credentials
    const user = await User.findOne({ username, password });

    if (user) {
        res.cookie('user', username);
        res.redirect('/tasks');
    } else {
        res.redirect('/login');
    }
});

app.get('/tasks', isAuthenticated, (req, res) => {
    db.query('SELECT * FROM tasks', (err, result) => {
        if (err) throw err;
        const tasks = result;
        res.render('tasks', { username: req.cookies.user, tasks });
    });
});

app.post('/tasks/add', isAuthenticated, (req, res) => {
    const { title, dueDate } = req.body;
    db.query('INSERT INTO tasks (title, due_date) VALUES (?, ?)', [title, dueDate], (err, result) => {
        if (err) throw err;
        res.redirect('/tasks');
    });
});
app.post('/tasks/delete/:id', isAuthenticated, (req, res) => {
    const taskId = parseInt(req.params.id);
    const taskIndex = tasks.findIndex(task => task.id === taskId);
    if (taskIndex !== -1) {
        tasks.splice(taskIndex, 1);
    }
    res.redirect('/tasks');
});

app.post('/tasks/update/:id', isAuthenticated, (req, res) => {
    const taskId = parseInt(req.params.id);
    const taskIndex = tasks.findIndex(task => task.id === taskId);
    if (taskIndex !== -1) {
        tasks[taskIndex].title = req.body.title;
        tasks[taskIndex].dueDate = req.body.dueDate;
    }
    res.redirect('/tasks');
});

app.listen(8000, () => {
    console.log('Server is running on port 8000');
});
