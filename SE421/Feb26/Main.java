package Feb26;
public class Main {
    
    public static void main(String args[]) {


        // int id1, id2;
        // float gpa1, gpa2;

        // id1 = 99;
        // gpa1 = 3.2f;
        
        // id2 = 88;
        // gpa2 = 2.4f;

        Student s1 = new Student();
        s1.id = 99;
        s1.gpa = 3.2f;

        //we can use the s1.init() to reset the s1 credentials

        Student s2 = new Student();
        s2.id = 88;
        s2.gpa = 2.4f;

        Student s3 = s1; 
        // s3 and s1 are both pointing at the same adress, basically pass by refrence

        print(s1);
        print(s2);

        // in here the method is of class main therefore you can do it this way

        s1.print();
        s2.print();


        //if we make s2 = s1 that means we will reasign the refrence of the memory and both
        // s1 and s1 will have the same refrence in the memory, therefore if the 
        //memory of s2 will be left with no refrence to it, then it will be
        //deleted (destructed).

        //so one print is in class Student and the other print is in the Main Class

        // second way because the print method is a method of a class student
        // so you can call it through calling an object

        //homework 

        for (int i = 0; i < 1000000; i++) {
            Student s = new Student();
        }

    }

    public static void print(Student s) {
        System.out.println(s.id);
        System.out.println(s.gpa);
    }




}
