const express = require('express');
const ejs = require('ejs');

// this class, using GET, the data we submit is withing the path,
// to avoid that, we use POST, in which the data of form will be encapsulated in the body

// Middleware, a block of code going to execute before your actual code, like layers before
// it reaches your annonymous function

const app = express();

app.set('view engine', 'ejs');

app.use((req, res, next) => {
  console.log(req.url + " " + req.method);
  next();
})

// we have to use post if we want to use the method post in the form, if we want a router to handle
// both of the POST and GET, then we can use app.all



// to attach a middleware, below
app.use(require('cors')())
app.use(express.urlencoded({ extended:true }));
app.use(express.json());





app.post('/auth', (req, res) => {
  console.log(req.query);
  console.log(req.params);
  // you cannot use query or params in POST, you have to use the body, but first modify the middleware
  console.log(req.body.password);
  console.log(req.body.fname);
  res.send("ok");
})


app.listen(80, () => {
  console.log('Now we are listening to port 80');
});