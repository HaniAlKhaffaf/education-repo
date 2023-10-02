package mar5;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1);
        // e.id = 121314; // problem 1 -should be read only
        // this problem can be solved by creating a constructor and deleting 
        // the setID method
        e.name = "Hani Amer";
        // e.salary = 500; //problem 2- can be negative or modified, 
        // solved by set and get
        // H.W read about final.

        // static variables or methods, you can call them without creating an objects

        e.setSalary(500);
        System.out.println(e.getid()); 
    }
}
