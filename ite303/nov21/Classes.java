package nov21;

public class Classes {
    public static void main(String[] args) {
        /*
         * Discussing classes and objects
         * 
         * objects are instances of classses
         */

        Student s1 = new Student();
        s1.name = "testing";
        s1.enroll();

        Student s2 = new Student();
        s2.name = "testing2";
        s2.unenroll();

        // Account a1 = new Account();
        Account a1 = new Account("John");
        // a1.name = "John";
        a1.setName("John");
        System.out.println(a1.getName());

        Account a2 = new Account("Leah");
        // a2.name = "Leah";
        a2.setName("Leah");
        a2.getName();

    }
}