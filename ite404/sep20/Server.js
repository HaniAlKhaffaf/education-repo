
const http = require('http');
console.log("Starting the web server");

// this function will automatically launch when there is a request

// the first argument is a pointer to the HTTP Connection
// the second arguemnt is an object that represents the response
// these two objects (The arguements) are very important to node.js
const server = http.createServer((req, resp) => { 
    console.log("New Request");

    //to find type of an object or something we can use typeof

    console.log(typeof req); //object
    console.log(req.constructor.name);
    console.log(typeof req.socket); //object
    console.log(req.socket.constructor.name); //name of class

    // req is a pointer, pointing at IncomingMessage class,
    // IncomingMessage also has Socket which can point at net which is pointed at
    // by remote and socket

    resp.write('<html><body><p>');
    resp.write(`the client ip is ${req.socket.remoteAddress}`);
    resp.write(`${req.socket.localAddress}`);
    resp.write(`${req.socket.remotePort}`);
    resp.write(`${req.socket.localPort}`);
    resp.write('</p></body></html>');

    resp.end();
});

  // TCP is the one that deals with Port numbers
  // HTTP protocol is just basically texting being forwarded and then being sent back
  // and later on the browser with an enginer will translate the text into GUI

  //http request and http response

server.listen(80, 'localhost'); 
console.log("End");