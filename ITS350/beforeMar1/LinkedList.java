package beforeMar1;
// import java.util.LinkedList;
public class LinkedList {
    Nodes head = null;
    Nodes tail = null;

    int size;


    void addAtFirst(int val) {
        Nodes node = new Nodes(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = node;
        }
        size++;
    }
        
    void display() {

    }


}

