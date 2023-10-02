package mar12;

abstract class Person {
    public String name;
    public  int id;

    public abstract int getId();
        // abstract means you will have to create a mthod with that name
        // and the children should implement it
}

// abstract means that you want to implement a method in a class, 6 classes have
// common functionality for this class, so all good, but then you have some subclasses,
// that have different functionalities, you should overwrite them, then you do that
// after some time (months) you want to add more subclasses, and they have different
// functionalities, therefore you have to remember that you have to override them
// otherwise they will give you the wrong funcationality, Here comes abstract, the
// super class wont implement the code for the method, the children should implement it
// if they dont implement it, then java wont compile it, it will give an error,
// so you should always implement the code of the abstract method in the
// subclasses
