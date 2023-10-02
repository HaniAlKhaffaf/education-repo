package mar9;

public class Main {
    public static void main(String[] args) {
        
        /*
         * we will be using CRC cards and UML class diagrams
         * UML class Diagram will allow you create models, without the needs of
         * algorithms or similar aspects, just gives you the bigger picture.
         *  
         * We start CRC, if easy, jump to implementation, If difficult, then go
         * go through UML class diagram then to implementation to avoid code 
         * refactoring in implementation.
         * 
         * you can represent the inheritence through arrows, from subclass to
         * super class
         * 
         * we have something that is like a diamond, which indicates that these
         * two classes are connected, either it points to the class and has
         * one object from it, or has multiple objects from it, 1 means one
         * object, * means multiple objects, the other one is 1 - 1.
         * which means there is an object that has a pointer which points
         * at the other class's object, and the other class does the same
         * thing about the first class, the main purpose of these connetions,
         * is to have an idea about how much the classes are coupled to eachother
         * 
         */

        //  Cat c = new Cat("mochi"); this will no longer work becasue we made
        // the cat class private

        Cat c = Cat.createInstance("Mochi");

        System.out.println(c.getName());



    }
}
