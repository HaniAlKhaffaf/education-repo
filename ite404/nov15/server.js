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


app.post('/view', (req, res) => {

    const sql = 'select * from comments;';
    const sql2 = 'select id, title, descr from comments;'; // same as line above
    const sql3 = 'select id as id from comments;'; // you will only get id
    const sql4 = 'select count(*) as count from comments;';// you will get number of rows
    const sql5 = 'select max ;';

    con.query(sql, (error, results, def) => {
        // def will give the data type, its not important
        if (error) throw error;
        //       console.log(results); // you will get json objects of what you have in the db
        for (const r of result) {
            console.log(r.id); // to get the id of each object
            res.write("<p>" + r.id + r.title + "</p>");
        }
        // we can also use the forEach method which is a bit better
        res.end();

        // if we use alias, then we have to change how we access it too
    }
    );
})


app.listen(8000);