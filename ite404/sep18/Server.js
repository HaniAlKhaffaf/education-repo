const http = require('http'); // this is a way of importing a library

console.log("Starting the web server");
const server = http.createServer((req, resp) => { // this method will be called
                                                  // whenever we send an http req
    console.log("New Request");
    resp.write('<html><body><p>');

    resp.write(`the client ip is ${req.socket.remoteAddress}`);
    resp.write('</p></body></html>');
    resp.end();
    // its one request, one response, means 1-1 relationship
    //so we can do something like 

    // resp.write(<html><body>);
    // resp.write(<p>Hello</p>);
    // resp.write(</body></html);
    // resp.end();
});
// port 80 is the default port, you can just browse localhost: and it will send
// a req 

// question: why is it sending two requests? -> one is for icon and one is for 
// our own index or homepage

// we need to send a request, to have the code executed otherwise, the block of 
// code wont do anything

server.listen(80, 'localhost'); // port 80 is http
console.log("End");