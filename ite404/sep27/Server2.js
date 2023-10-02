const express = require('express');


var app = express();

app.set('view engine', 'ejs');


app.get('/', (req, res) => {
  res.render('home');
});

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});