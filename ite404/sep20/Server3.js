
const http = require('http');
const fs = require('fs');

// the annonymous function below will be executed in the server
// second annonymous function will be called when we read the file 
const server = http.createServer((req, res) => { 

  fs.readFile('./views/index.html', (err, data) => {
    if(err) {
        console.log(err);
        res.end();
    } else{
      // if everything went well and we got the data
      res.write(data);
      res.end();
    }
  });
  res.end();
});

// usually you will have to wait for the response and then use res.end() otherwise
// it will execute end() because you read the data

// the annonymous functions are inside eachother but they dont have to execute
// after eachother fast, they are waiting, first function is waiting for a request
// and the second function is waiting for the data to be read


server.listen(80, () => {
  console.log("Now we are listning to port 80");
}); 