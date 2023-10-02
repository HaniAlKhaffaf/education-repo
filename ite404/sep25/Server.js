
const http = require('http');
const fs = require('fs');

var file_content = null;

  fs.readFile('./views/index.html', (err, data) => {
    if(err) {
      console.log(err);
      return;
    }
    file_content = data;
  });

  // what is a status code, they are between 100 - 600
  /*
  100 ----> informal metadata
  200 ----> Ok
  300 ----> Redirect
  400 ----> error from client
  500 ----> 
  
  */
  
  const server = http.createServer((req, res) => {

    res.setHeader('Content-Type', 'text/html'); // to set the res read it always as html
    // we can do this too  res.setHeader('Content-Type', 'text/plain'); to make it plain text
    
    let file_name = './views/';
    switch(req.url) {
      case '/': 
        res.statusCode = 200;
        file_name += 'index.html';
        break;

      case '/about': 
        res.statusCode = 200;
        file_name += 'about.html';
        break;

      case '/res/logo.png':
        // read file for specific image location

      default:
        res.statusCode = 404;
        file_name += '404.html';

    }

    fs.readFile(file_name, (error, data) => {
      if(error) {
        console.log(error);
        res.end();
        return;
      }
    })
  })



server.listen(80, () => {
  console.log("Now we are listning to port 80");
}); 