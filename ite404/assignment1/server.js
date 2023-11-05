const express = require('express');
const session = require('express-session');
const cookieParser = require('cookie-parser');

const app = express();
const port = 3000;

app.use(cookieParser());
app.use(session({
    secret: 'your-secret-key',
    resave: false,
    saveUninitialized: false,
    // You can configure more options here, such as session expiration and storage.
}));

app.use(express.json());
app.use(express.urlencoded({ extended: true }));


// Sample users data (you should use a database in a real application)
const users = [
    { id: 1, username: 'user1', password: 'password1' },
    { id: 2, username: 'user2', password: 'password2' },
];
const todos = [];

app.get('/loginForm', (req, res) => {
    app.render('/login');
})

// Login route
app.post('/login', (req, res) => {
    const { username, password } = req.body;

    const user = users.find(u => u.username === username && u.password === password);
    if (user) {
        req.session.user = user; // Store user information in the session
        res.send('Login successful');
    } else {
        res.status(401).send('Invalid credentials');
    }
});

// Logout route
app.get('/logout', (req, res) => {
    req.session.destroy(err => {
        if (err) {
            console.error('Error destroying session:', err);
        }
        res.redirect('/');
    });
});


function requireAuthentication(req, res, next) {
    if (req.session.user) {
        next(); // User is authenticated, continue to the next middleware
    } else {
        res.redirect('/login'); // Redirect to the login page
    }
}

// Example of a protected route
app.get('/profile', requireAuthentication, (req, res) => {
    res.send(`Welcome, ${req.session.user.username}!`);
});

app.post('/todos', requireAuthentication, (req, res) => {
    const { title } = req.body;
    const id = todos.length + 1;
    const todo = { id, title, completed: false };
    todos.push(todo);
    res.status(201).json(todo);
});

// Get all todos
app.get('/todos', requireAuthentication, (req, res) => {
    res.json(todos);
});

// Update a todo by ID
app.put('/todos/:id', requireAuthentication, (req, res) => {
    const id = parseInt(req.params.id);
    const todo = todos.find((t) => t.id === id);

    if (!todo) {
        return res.status(404).json({ error: 'Todo not found' });
    }

    todo.title = req.body.title || todo.title;
    todo.completed = req.body.completed || todo.completed;

    res.json(todo);
});

// Delete a todo by ID
app.delete('/todos/:id', requireAuthentication, (req, res) => {
    const id = parseInt(req.params.id);
    const index = todos.findIndex((t) => t.id === id);

    if (index === -1) {
        return res.status(404).json({ error: 'Todo not found' });
    }

    todos.splice(index, 1);
    res.status(204).send();
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
