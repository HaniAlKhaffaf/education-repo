const express = require('express');
const mysql = require('mysql');

// class lab not completed
var app = express();

app.use(require('cors')())
app.use(express.urlencoded({ extended: true }));
app.use(express.json());


var con = mysql.createConnection({
    host: '127.0.0.1',
    user: 'auis',
    password: 'auis1234',
    database: 'ite404'

})

con.connect(function (err) {
    if (err) throw err;
    console.log('connected');
})

app.get('/', (req, res) => {
    console.log('Hello from index');
    var sql = "INSERT into comments (title, descr) values ('test) "
    con.query(sql, (err, result) => {
        if (err) throw err;
        console.log("1 record has been inserted");
    })
    res.end();
})

app.get('/input', (req, res) => {
    res.render('form');
    res.end();
})

app.post('/add', (req, res) => {
    const title = req.body.title;
    const desc = req.body.description;
    res.end();
})

app.listen(8000);