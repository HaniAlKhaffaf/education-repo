const express = require('express');
const mysql = require('mysql');
const ejs = require('ejs')

var app = express();

app.set('view engine', 'ejs');

app.use(express.urlencoded({ extended: true }));
app.use(express.json());


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


app.get('/input-points', (req, res) => {
    const query = 'SELECT * FROM syllabus';

    con.query(query, (err, results) => {
        if (err) {
            console.error('Error executing query:', err);
            res.status(500).send('Internal Server Error');
            return;
        }

        res.render('form', { courses: results });
    });
});

app.post('/submit-points', (req, res) => {
    const pointsData = req.body;

    for (const itemId in pointsData) {
        const points = parseInt(pointsData[itemId], 10);

        const updateQuery = `UPDATE syllabus SET points = ${points} WHERE id = ${itemId}`;

        con.query(updateQuery, (err, results) => {
            if (err) {
                console.error('Error updating points:', err);
                res.status(500).send('Internal Server Error');
                return;
            }
        });
    }

    res.redirect('/');
});

app.get('/view', (req, res) => {
    const query = 'SELECT * FROM syllabus';

    con.query(query, (err, syllabi) => {
        if (err) {
            console.error('Error fetching syllabi data:', err);
            res.status(500).send('Internal Server Error');
            return;
        }

        // Calculate the average points
        const totalPoints = syllabi.reduce((sum, syllabus) => sum + syllabus.points, 0);
        const averagePoints = totalPoints / syllabi.length;

        res.render('view', { syllabi, averagePoints });
    });
});



app.listen(8000);