const express = require('express');
const ejs = require('ejs');

// this class will talk about passing argument back from the server to the client
// basically dynamic variables

var app = express();

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
  res.render('/home');
  res.end();
})

app.get('/theme/:theme', (req, res) => {
  console.log(req.params.theme);
  res.end();
});

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});