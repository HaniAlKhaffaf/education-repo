package mar12;

public class Main {
    public static void main(String[] args) {
        
        // in this lecture Dr Yad will explain polymorphism. 
        // Polymorephism, Chapter 10
        // because of inheritence, we can use polymorephism.

        // Animal a1 = new Cat("D");
        // System.out.println(a1.getName());
        // a1.setName("Moe");

        Student s1 = new Student();
        s1.name = "Maya";

        Faculty f1 = new Faculty();
        f1.name = "Tahir";

        // print(f1);
        // print(s1);

        // instanceof is a pointer expression   

        // in polymorephism, we care about the fact that the code becomes generic
        // it cares and only has to know that the method knows it is part of class
        // Person and doesn't care about its subclasses

        // so polymorephism, it links a utility with the father class, and through
        // the father class, you can access the variables of the children





        // anything exist in cat object but doest exist in animal, we cant use it
        //example -> a1.getColor();
        // so we can access the details of the main class(superclass) and
        // not the subclass, 


    }


    public static void print(Person p) {
        System.out.println(p.name);
        System.out.println(p.getId());
        // it is fine to print just the name because of polymorephism,
        // you can print the main thing that is shared among them
        // which is the "name" in our case
    }
}
