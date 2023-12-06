const express = require('express');
const mysql = require('mysql');
const ejs = require('ejs')

var app = express();

app.set('view engine', 'ejs');
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.get("/ui", (req, res) => {
    res.render('ui');
})

app.get('/web-services', (res, req) => {
    res.set('Content-Type', 'application/json');
    let msg = { name: "Hani Amer", sid: Math.random(), gpa: 3.2 };
    res.write(JSON.stringify(msg));
    res.end();
})


app.listen(8000);