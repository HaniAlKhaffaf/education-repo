
/* Hani Amer ha20431@auis.edu.krd    Noor Safaa ns20352@auis.edu.krd */

const express = require('express');
const session = require('express-session');
const cookieParser = require('cookie-parser');
const app = express();
const port = 8000;

app.set('view engine', 'ejs');
app.use(express.static('public'));
app.use(cookieParser());
app.use(session({
    secret: 'verySecretKey',
    resave: false,
    saveUninitialized: false,
}));
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// creating multiple users
const users = [
    { username: 'hani123', password: 'hani123' },
    { username: 'harry', password: 'harry123' },
    { username: 'ron', password: 'ron123' },
];

// i am using this middleware so that i can authenticate the user in each step
function requireAuthentication(req, res, next) {
    if (req.session.user) {
        next();
    } else {
        res.redirect('/login');
    }
}

// main page, retrieving the data from cookie and displaying them, also the username
app.get('/', requireAuthentication, (req, res) => {
    const user = users.find((u) => u.username === req.session.user.username);
    const tasks = JSON.parse(req.cookies[`${user.username}_tasks`] || '[]');
    res.render('todo', { user, tasks });
});

// loogin page render
app.get('/login', (req, res) => {
    res.render('login');
});

// processing the data of logging in
app.post('/login', (req, res) => {
    const { username, password } = req.body;
    const user = users.find((u) => u.username === username && u.password === password);
    if (user) {
        req.session.user = user;
        res.redirect('/');
    } else {
        res.redirect('/login');
    }
});

// processing the logout
app.get('/logout', (req, res) => {
    req.session.destroy(() => {
        res.redirect('/login');
    });
});

// for adding new tasks
app.post('/tasks', requireAuthentication, (req, res) => {
    const user = users.find((u) => u.username === req.session.user.username);
    const tasks = JSON.parse(req.cookies[`${user.username}_tasks`] || '[]');
    const { title, dueDate } = req.body;
    tasks.push({ title, dueDate });
    res.cookie(`${user.username}_tasks`, JSON.stringify(tasks));
    res.redirect('/');
});

// for deleting tasks
app.post('/tasks/:index/delete', requireAuthentication, (req, res) => {
    const user = users.find((u) => u.username === req.session.user.username);
    const tasks = JSON.parse(req.cookies[`${user.username}_tasks`] || '[]');
    const index = parseInt(req.params.index);
    if (index >= 0 && index < tasks.length) {
        tasks.splice(index, 1);
        // i am basically removing the desired task by the index when pressed
    }
    res.cookie(`${user.username}_tasks`, JSON.stringify(tasks));
    res.redirect('/');
});

// code for updating the tasks
app.post('/tasks/:index/update', requireAuthentication, (req, res) => {
    const user = users.find((u) => u.username === req.session.user.username);
    const tasks = JSON.parse(req.cookies[`${user.username}_tasks`] || '[]');
    const index = parseInt(req.params.index);
    if (index >= 0 && index < tasks.length) {
        const { title, dueDate } = req.body;
        tasks[index].title = title;
        tasks[index].dueDate = dueDate;
    }
    res.cookie(`${user.username}_tasks`, JSON.stringify(tasks));
    res.redirect('/');
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});


/* REFRENCES

    1- For creating user authentication and widdleware, Link: https://jonathan-holloway.medium.com/node-and-express-session-a23eb36a052
    2- For creating cookies and how to use their data, Link: https://developer.mozilla.org/en-US/docs/Web/HTTP/Cookies
    3- For deleting the Tasks i learned how to use Splice, Link: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/splice
    4- For learning how to use the External CSS in expressjs, Link: https://medium.com/@kyosuke0215/how-to-use-external-css-in-node-js-with-express-f50d2a956e3a
    5- For styling i used a combintion of my own, chatGPT, and this website: https://copy-paste-css.com/

*/
