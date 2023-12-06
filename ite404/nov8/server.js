const express = require('express');
const mysql = require('mysql');

var app = express();

var con = mysql.createConnection({
    host: '127.0.0.1',
    user: 'auis',
    password: 'auis123',
    database: 'ite404'

})

const courseSyllabi = [
    {
        courseName: 'Web Application Programming',
        courseId: 'ITE404',
        instructorName: 'Yad Tahir',
        time: '9:45 - 11:15',
        courseDescription: 'Course teaching Nodejs and backend programming'
    },
    {
        courseName: 'Distributed Computing',
        courseId: 'SE355',
        instructorName: 'Yad Tahir',
        time: '9:15 - 10:15',
        courseDescription: 'Teaching about distributed computing'
    }
];

con.connect(function (err) {
    if (err) throw err;
    console.log('connected');
})

app.get('/save', (req, res) => {
    courseSyllabi.forEach((syllabus) => {
        con.query(
            'INSERT INTO courses (courseName, courseId, instructorName, time, courseDescription) VALUES (?, ?, ?, ?, ?)',
            [
                syllabus.courseName,
                syllabus.courseId,
                syllabus.instructorName,
                syllabus.time,
                syllabus.courseDescription
            ],
            (error, results) => {
                if (error) {
                    console.error(error);
                    res.status(500).json({ error: 'Internal Server Error' });
                } else {
                    console.log(`Course ${syllabus.courseId} inserted with ID ${results.insertId}`);
                }
            }
        );
    });
})


app.listen(8000);