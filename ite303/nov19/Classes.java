package nov19;

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

        Account a1 = new Account();
        a1.name = "John";

        Account a2 = new Account();
        a2.name = "Leah";

    }
}