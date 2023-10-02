package assignment2;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Requirement 1
        tree.insert(10.15, "Introduction to Java");
        tree.insert(9.30, "Data Structures");
        tree.insert(12.15, "Algorithms");
        tree.insert(11.15, "Software Engineering");

        // Requirement 2
        tree.delete(10.15);

        tree.inorder();

        // Requirement 3
        System.out.println(tree.countClasses());

        // Requirement 4
        System.out.println(tree.countClassesAfter(9.30));

        // Requirement 6
        tree.nextClass(12.15);

        // Requirement 5
        tree.classesTimesReverse(tree);;
    }


}
