package apr19;

public class Traversals {
    void inOrder(Nodes node) {
        if(node != null){
            inOrder(node.leftChild);
            System.out.println(node.data);
            inOrder(node.rightChild);
        }
    }

    void preOrder(Nodes node) {
        if(node != null){

            System.out.println(node.data);
            preOrder(node.leftChild);            
            preOrder(node.rightChild);
        }
    }

    void postOrder(Nodes node) {
        if(node != null){

            
            postOrder(node.leftChild);            
            postOrder(node.rightChild);
            System.out.println(node.data);
        }
    }
}