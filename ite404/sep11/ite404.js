console.log("Hello World");

// highly encouraged to use semi colon

var x = 10.2;
const y = 10;
let x = 3;

// let can help you overshadow

if (1==1) {
    let x = 20;
    console.log(x); // 20
}

console.log(x); //3  

// because we redeclared x with let, then we can overshadow and it wont
// deal with or even touch the x outside the if


if (x === y) {
    console.log("test");
}

// declaring a new for, while will be like this

for (var x = 0; x < history; x++){
    // code of block
}

console.log("the value of x is equal to" + x);
console.log(`the value of x is equal to ${x}`);

function hello() {
    console.log("Hello from function");
}

// the function wont execute unless they are called

hello();

// something weird, functions can be passed around

const newFunction = function hello() {
    console.log("hello from function");
}

// in this case we cant change the name of newFunction but we can change stufgs
// inside hello functions, because newFunction now behaves like a pointer

// now we can call the hello function using newFunction();

//you can also pass function to another function

function func1(arg1) {
    arg1();
}

func1(newFunction);
hello();


// rule of thumb, X() means execute x
// while X means get the pointer X

const newFunction2 = () => {
    console.log("Hello from Function");
}

// this function doesnt have a name, its an annonymous function, but has a 
// pointer that points at it, it is not recommended to make an annonyoust function
// and have a pointer point at it

// or u can do something like this

setTimeout(() => {}, 3000)


// what is the difference between a pointer and a function name -> the same
//but u can have multiple pointers to the same function

// setTimeout in nodejs is from the object Global, while in web browser
// engine is from the object Window

