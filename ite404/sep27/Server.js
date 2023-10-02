const express = require('express');
// console.log(express);

var app = express();

app.get('/', (req, res) => {
  // res.send('<html><body>Home</body></html>');
  // send() already does the function of write() and end()

  res.status(202);
  res.type('html'); // Content-Type, text/html
  // res.set('Content-Type', 'text/html') // Same function as line above, choose one
  res.sendFile('./views/index.html', { root: __dirname});
  // he {root: __dirname} -> it is a variable that shows the current file location
  // it is always better to use it whenever you use a relative path

  // you can do something as the following due to design pattern called ApplicationSpecificDomain pattern
  // res.status(200).type('html').sendFile('./views/index.html', { root: __dirname});
})

app.get('/about', (req, res) => {
  res.send('<html><body>about</body></html>');
  // send() already does the function of write() and end()
})

app.get('/about-en', (req, res) => {
  res.redirect('/about')
})

app.get('/res/logo.png', (req, res) => {
  res.sendFile('./res/AUIS_symbol.png', { root: __dirname});
})

app.use('/uploads', express.static(__dirname + '/public'));
// you use the code above, means you can put all of your images, icons
// what you will do is that you will expose them to the client, and they can
// access it using uploads
// you can check out the about.html to see how to call the image

app.use((req,res) => {
  res.status(404).sendFile('./views/404.html', { root: __dirname});
});

app.listen(80, () => {
  console.log('Now we are listening to port 80');
});