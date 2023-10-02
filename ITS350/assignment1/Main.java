package assignment1;

public class Main {
    public static void main(String[] args) {

        /*
         * 
         *      Hani Amer Salih   20-00431
         * 
         * 
         *      IMPORTANT
         * 
         *      To test the application, Run this class (Main class)
         *      The Main class doesn't contain any code that is related
         *      to the assignment but rather just for display, the Class
         *      Classrooms has all of the code related to the assignment
         *      along the logic, Thanks.
         * 
         * 
         */

        // Requirement 1
        // Creating 2 Classrooms each with its own data
        Classrooms classA = new Classrooms();
        Classrooms classB = new Classrooms();

        // // classroom 1
        classA.schedule(2.15);
        classA.schedule(6.0);
        classA.schedule(12.0);
        classA.schedule(15.45);

        // // classroom 2
        classB.schedule(7.30);
        classB.schedule(10.0);
        classB.schedule(11.30);
        classB.schedule(12.45);
        classB.schedule(17.45);

        System.out.println("After Requirement 1 we have the below list of both classes");
        classA.display("A");
        classB.display("B");

        // Requirement 2 for removing lectures
        // un-scheduling
        classA.unSchedule(12.0);
        classB.unSchedule(12.45);

        System.out.println("After Requirement 2 we have the below list of both classes");
        classA.display("A");
        classB.display("B");

        // Requirement 3 for adding lectures
        classA.schedule(6.30); // this one wont add
        classA.schedule(13); // This one will add successfully
        classB.schedule(14); // This one will add successfully

        System.out.println("After Requirement 3 we have the below list of both classes");
        classA.display("A");
        classB.display("B");

        // Requirement 4 for demonstrating the first and last lecture in each classroom
        
        System.out.println("Below Requirement 4 will be demonstrated");
        classA.firstLecture("A");
        classA.lastLecture("A");

        classB.firstLecture("B");
        classB.lastLecture("B");

        System.out.println();


        // Requirement 5 for counting the size of the data structure
        System.out.println("Below Requirement 5 will be demonstrated");
        classA.printNumberOfLectures("A");
        classB.printNumberOfLectures("B");
        System.out.println();

        // Requirement 6 for combining
        System.out.println("Below Requirement 6 will be demonstrated by combining the lectures of both classrooms");
        classB.combine(classA);
        classB.display("A and B");

        // Requirement 7 will be found above each method in the Classrooms class
    }
}
