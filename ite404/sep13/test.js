console.log("Test");
let i = 2023;

console.log("Hello \n" + i);

const func1 = () => {
    console.log("Hello");
    return 2023;
    
};

//func1(); // to call it

// console.log(func1());

/*const year = func1();*/ // it means that the variable year will hold the year, which is 2023

/*const year = func1;*/  // now this one is different from the one above, this one
                         // now will have the year as a pointer that points to the
                         // function func1();

const student = {
    sid: 10,
    first: 'Yad',
    last: 'Tahir',
    full_name: () => {
        console.log(student.first);
        console.log(student.last);
    }
};

// in the object above, firs it solves the second part after the = and then
// goes back to the student and assign it by settings its pointer to
// the first byte above in the object

console.log(student);

// always when dealing with objects, use const, recommended, so that the pointer
// cannot be changed, but the attritbutes inside the object can be changed 
// without any problems

student.age = 3.2 // adding a new attribute to the object
student.print = () => {
    console.log("Hello");
}

delete student.print; // to delete an attribute


const keys = Object.keys(student); //to show the keys
console.log(keys);