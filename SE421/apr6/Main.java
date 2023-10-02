package apr6;

public class Main{
    public static void main(String[] args) {

        // We will learn how to compare two objects

        Employee e1 = new Employee();
        e1.setName("Ali");
        e1.setId(1);
        e1.setAdress("Somewhere");

        Employee e2 = new Employee();
        e2.setName("Ali");
        e2.setId(1);
        e2.setAdress("Somewhere");

        e1.equals(e2);

    }

//                  BELOW METHOD MOVED TO EMPLOYEE FOR BETTER DESIGN

    // public static Boolean check(Employee arg1, Employee arg2) {
    //     Boolean result = false;

    //     // result = arg1 == arg2;

    //     result = arg1.getId() == arg2.getId() 
    //     && arg1.getName().equals(arg2.getName()) 
    //     && arg1.getAdress().equals(arg2.getAdress());

    //     // complexity is that whe nwe add attribute we will have to change 
    //     // the complex code above

    //     return result;
    // }

}