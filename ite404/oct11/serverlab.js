const express = require('express');
const ejs = require('ejs');

// this class, using GET, the data we submit is withing the path,
// to avoid that, we use POST, in which the data of form will be encapsulated in the body

// Middleware, a block of code going to execute before your actual code, like layers before
// it reaches your annonymous function

const app = express();

app.set('view engine', 'ejs');



// we have to use post if we want to use the method post in the form, if we want a router to handle
// both of the POST and GET, then we can use app.all



// to attach a middleware, below
app.use(require('cors')())
app.use(express.urlencoded({ extended:true }));
app.use(express.json());





app.post('/form', (req, res) => {
  const name = req.body.name;
  const id = req.body.id;
  const birthDate = req.body.birthDate;
  res.send("ok");
})

app.post('/add', (req, res) => {
  
})


app.listen(80, () => {
  console.log('Now we are listening to port 80');
});