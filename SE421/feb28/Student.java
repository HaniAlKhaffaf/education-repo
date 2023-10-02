package feb28;

// Complex Data types (DTs)
// Complex Data types are like objects, i.e: Student objects, because they have
// mulitple primitive data types + methods, so thats why its called complex
public class Student {
    int id;
    String name;
    float gpa;
    Department dept;



    
    public void print() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("gpa: " + gpa);
        System.out.println("department: " + dept.id);
        System.out.println("department: " + dept.name);
        // you can use different objects in different classes, like
        // you can use dept name and id in student and then in main

    }

    // public void print() {
    //     System.out.println("id: " + id);
    //     System.out.println("name: " + name);
    //     System.out.println("gpa: " + gpa);
    //     dept.print();

    // }


    // the second type of method is better because it is dynamic, if u change
    // department, then you dont have to modify also student or other
    // different files
}
