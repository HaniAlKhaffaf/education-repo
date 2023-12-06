const express = require('express');
const mysql = require('mysql');
const ejs = require('ejs')

var app = express();

app.set('view engine', 'ejs');

var con = mysql.createConnection({
    host: '127.0.0.1',
    user: 'auis',
    password: 'auis123',
    database: 'ite404'

})


con.connect(function (err) {
    if (err) throw err;
    console.log('connected');
})

app.get('/select', (req, res) => {
    res.render("form");
})

app.post('/delete', (req, res) => {

    con.query(

        (error, results) => {
            if (error) {
                console.error(error);
                res.status(500).json({ error: 'Internal Server Error' });
            } else {
                console.log(`Course ${syllabus.courseId} inserted with ID ${results.insertId}`);
            }
        }
    );
})


app.listen(8000);