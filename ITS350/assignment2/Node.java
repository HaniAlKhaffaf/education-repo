package assignment2;

public class Node {
    double startTime;
    String lectureName;
    Node left;
    Node right;
 
    public Node(double startTime2, String lectureName) {
        this.startTime = startTime2;
        this.lectureName = lectureName;
        left = null;
        right = null;
    }
}
