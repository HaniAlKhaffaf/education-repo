package feb28;

public class Main {

    public static void main(String args[]) {


        // Main goal of this class is the usage of oop and how you can make
        // your code more dynamic, one change doesn't have to modify
        // different files

        // try to avoid using primitive data types, because they are
        // not dynamic but rather static

        // RULE OF THUMB ---> Each class should be speciallized in doing
        // one task, focus only on one, and it should be dynamic

        // OOP Analysis and OOP Design --> what you do before you start coding


        // code is too messy, the code is not in the right place


        Department d1 = new Department();
        d1.name = "IT/SE";
        d1.id = 100;

        Student s1 = new Student();
        s1.id = 100;
        s1.dept = d1;
        // s1.deptName = "IT/SE";
        // s1.deptID = 100;

        Student s2 = new Student();
        s2.id = 101;
        s2.dept = d1;
        // s2.deptName = "IT/SE";
        // s2.deptID = 100;

        Student s3 = new Student();
        s3.id = 102;
        s3.dept = d1;
        // s3.deptName = "Math";
        // s3.deptID = 200;


        Department it = new Department();
        it.name = "IT/SE";

        Department math = new Department();
        it.name = "Math";

        // func1(s1);qa ZSA
        print(s1, "department");
    }

    public static void func1(Student arg1) {
        // we have one argument, but in reality, this one argument is a
        // complex arguemnt, because it has students, and students then 
        // has department which also has its own values.
        arg1.print();
        System.out.println("Department name: " + arg1.dept.name);
    }

    public static void print(Student student, String attribute) {
        if (attribute == "id") {
            System.out.println(student.id);
        } else if (attribute == "name") {
            System.out.println(student.name);
        } else if (attribute == "gpa") {
            System.out.println(student.gpa);
        } else if (attribute == "department") {
            System.out.println(student.dept.name);
        }
  
    }
    
}
