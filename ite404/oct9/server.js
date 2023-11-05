const express = require('express');
const ejs = require('ejs');

// this class will talk about passing argument back from the server to the client
// basically dynamic variables

var app = express();

app.set('view engine', 'ejs');

app.get('/welcome', (req, res) => {
  console.log(req.query.fname);
})


// So now we have query and params, for query its for data after the ? in the url, while params is before it
// so basically if u want something inside the URL, then u can use the params, if you want data from forms
// then u use the query

// app.get('/users/:uid', (req, res) => {
//   console.log(req.url);
//   console.log(req.params.uid);
//   res.end();
// });

// app.get('/output', (req, res) => {
//   console.log(req.url);
//   console.log(param);
//   res.end();
// })

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});