
const http = require('http');
console.log("Starting the web server");

const server = http.createServer((req, resp) => { 
    console.log('requested');
    console.log(req.rawHeaders);
    // the request has metadata that will be sent from the user, the server will
    // know some metadata about the user and then you adjust specific code
    // to each type of user accordingly

    // a loop to get values and keys
    const arr = req.rawHeaders;
    console.log(arr);
    for(let i = 0; i < arr.length; i+=2) {
      resp.write(`${arr[i]} = ${arr[i+1]} <br />`);
    }

    resp.end();
});


server.listen(80, () => {
  console.log("Now we are listning to port 80");
}); 


/*OBJECTIVE

Req is an object with raw metadata and text
res is also an object with some metadata and text (html, css, js,.... etc)



*/