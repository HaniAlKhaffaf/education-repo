const express = require('express');


var app = express();

app.set('view engine', 'ejs');
//app.set('views', __dirname + '/views');

  const courses = [
    {code: 'ITE404', name: 'Web Application Programming'},
    {code: 'ITE306', name: 'Computing Platforms'},
    {code: 'ITE202', name: 'Introduction to it systems'}
  ]

app.get('/', (req, res) => { res.render('home', {name: 'Hani', courses}); });
app.get('/about', (req, res) => { res.render('about'); });

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});