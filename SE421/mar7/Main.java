package mar7;

public class Main {
    public static void main(String[] args) {
        
        // Dr. Yad introduced the inheritence feature in java or in all OOP
        // we have to prevent code duplication, thats why we can create
        // a relationship using inheritence and get rid of the code duplication

        // super class (the father)
        // sub class (the child)

        // it becomes like a tree-like structure due to inheritence, no we will
        // using the inheritence for our design

        // Inheritence Limitations -->
        // 1- a class can only have one super class
        // 2- any class if it doesnt extend, it automatically extends class Object
        // i.e. -> s.toString() you wont get error because student extends object class

        // two major disadvantages of inheritence -->
        // 1- due to inheritence, we will have tightly coupled classes, which means that classes
        // will rely on eachother which creates rigidness, therefore its better to
        // have classes seperated
        // 2- you can only have one super class, sometimes u need to have to extend 
        // something like a library, but at the same time you need to extend your
        // own custom class

        Faculty f = new Faculty();
        Student s = new Student();

        f.setName("Hani");
        s.setName("Amer");
        
        System.out.println(f.getName());


    }
}
