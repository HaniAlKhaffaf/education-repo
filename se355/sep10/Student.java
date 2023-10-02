package sep10;

public class Student {
    int id;
    float gpa;

    public Student(int id, float gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Student(int id) {
        this.id = id;
    }

        public Student() {
    }

    // we can do something like this

    // public Student() {
    //     this(0);
    // }

    // public Student(int id) {
    //     this(id, 0.0f);
    // }

    // public Student(int id, float gpa) {
    //     this(id, gpa);
    // }



    public void print() {
        System.out.println(id);
        System.out.println(gpa);


    }

    /*
     * 
     * SEStudent s1 = new SEStudent();
     * ITStudent s2 = new ITStudent();
     * or u can use the interface Student pointer to
     * access both classes but only using the methods mentioned inside
     * the interface, otherwise the object of type interface wont understand
     * the extra methods inside the classes
     * 
     * to point an interface pointer, u have to cast it by using () so that
     * the new pointer will know which class inside the interface
     * 
     * Very Important class to understand pointers and interfaces behaviours
     * 
     * combining arrays with polymorphism will be something like
     * 
     * Student[] arr = new Student[100];
     * 
     * now you can store all types of Students in that specific array
     * 
     * 
     * 
     */


/*
 * 
 * we also study interfaces
 */

}
