const express = require('express');
const ejs = require('ejs');

const cookieParser = require('cookie-parser');

const app = express();
app.use(cookieParser());

app.gget('/logout', (req, res) => {
    res.cookie('counter', ''); // ugly approach, the cookie is still there, you just made the value null
    res.clearCookie('counter'); // better way to delete a cookie
    res.status(202).end();
});

app.get('/', (req, res) => {
    console.log(req.cookies.msg);
    // res.cookie('msg', 'auis and ite404')
    res.send("<p> " + req.cookies.msg + "</p>") // be able to print he msg of the cookie


    const c = req.cookies.counter;
    if (!c) {
        res.cookie('counter', 1, { maxAge: 360000 }); // the third argument is a json, its an expiration date
        // we can also use the property expire:, but expire can also take Date
        // each time we refresh the page, the timer is reseting
    } else {
        // not a new client
        res.cookie('counter', parseInt(c) + 1);

        // in here, the counter is incrementing and not keeping on creating new cookies because we are using the exact same key, and only changing
        // the value, therefore, the cookies keeps on updating its value
    }
    res.send("<p> + c + </p>");
});

app.listen(8000);