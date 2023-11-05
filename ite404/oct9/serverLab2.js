const express = require('express');
const ejs = require('ejs');



var app = express();

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
  // res.render('home');
  res.end();
})

app.get('/login', (req, res) => {
  
  res.render('login');
  const fname = req.query.fname;
  const pass = req.query.password;
  res.end();
});

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});