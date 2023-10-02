package assignment2;


public class BinarySearchTree {
    Node root;
    int size;
 
    public BinarySearchTree() {
        root = null;
    }
 
    // Requirement 1
    // The User can insert classes and schedule them


    void insert(double startTime, String lectureName) {
        root = insertRec(root, startTime, lectureName);
    }
 
    Node insertRec(Node root, double startTime, String lectureName) {
        if (root == null) {
            root = new Node(startTime, lectureName);
            return root;
        }
        if (startTime < root.startTime)
            root.left = insertRec(root.left, startTime, lectureName);
        else if (startTime > root.startTime)
            root.right = insertRec(root.right, startTime, lectureName);
        return root;
    }
 
    void inorder() {
        inorderRec(root);
    }
 
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.startTime + " - " + root.lectureName);
            inorderRec(root.right);
        }
    }


    // Requirement 2
    // the method below will allow me to unSchedule classes
    
    Node deleteRec(Node root, double startTime) {
        if (root == null)
            return null;
        if (startTime < root.startTime)
            root.left = deleteRec(root.left, startTime);
        else if (startTime > root.startTime)
            root.right = deleteRec(root.right, startTime);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            Node temp = minValueNode(root.right);
            root.startTime = temp.startTime;
            root.lectureName = temp.lectureName;
            root.right = deleteRec(root.right, temp.startTime);
        }
        return root;
    }

    void delete(double startTime) {
        root = deleteRec(root, startTime);
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Requirement 3

    // Used recursive methods to count the numbers of classes that we have in the tree
    
    int countClasses() {
        return countClassesRec(root);
    }

    int countClassesRec(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + countClassesRec(node.left) + countClassesRec(node.right);
    }
    
    // Requirement 4

    // used recursive method to count the number of classes after given one

    int countClassesAfter(double startTime) {
        return countClassesAfterRec(root, startTime);
    }

    int countClassesAfterRec(Node node, double startTime) {
        if (node == null)
            return 0;
        if (node.startTime <= startTime)
            return countClassesAfterRec(node.right, startTime);
        else
            return 1 + countClassesAfterRec(node.left, startTime) + countClassesAfterRec(node.right, startTime);
    }

    // Requirement 5
    

    static void reverseClasses(Node node, char targetChar) {
        // this method will implemented throughout the classesTimesReverse method
        if (node != null) {
            reverseClasses(node.right, targetChar);
            if (Character.toUpperCase(node.lectureName.charAt(0)) == Character.toUpperCase(targetChar)) {
                System.out.print(node.startTime + "    ");
            }
            reverseClasses(node.left, targetChar);
        }
    }

    static void classesTimesReverse(BinarySearchTree bst) {                                                           
        if (bst.root != null) {
            char firstChar = bst.root.lectureName.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                for (char c = 'Z'; c >= 'A'; c--) { // for Capital Letters
                    reverseClasses(bst.root, c);
                }
            } else {
                for (char c = 'z'; c >= 'a'; c--) { // for small letters
                    reverseClasses(bst.root, c);
                }
            }
        }
        System.out.println("Classes are printed in reverse alphabtical order");
    }

    // Requirement 6 

    // This method below ill give us the class that we have after the classtime 
    // that we provide for it
    void nextClass(double time) {
        Node current = root;
        Node nextBiggerNode = null;

        while (current != null) {
            // for traversing
            if (current.startTime > time) {
                nextBiggerNode = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // for printing with if statements
        if (nextBiggerNode != null) {
            System.out.println("the next class starts in " + nextBiggerNode.startTime);
        } else {
            System.out.println("there is no next class.");
        }
    }


}
