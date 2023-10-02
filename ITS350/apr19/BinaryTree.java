package apr19;

public class BinaryTree{
    Nodes root;

    Nodes findMinimum() {
        Nodes current = root;
        while (current!=null) {
            if (current.leftChild == null){
                return current;
            } else current = current.leftChild;
        } return null;
    }

    // int findMinimumCounter() {
    //     Nodes current = root;
    //     while (current!=null) {
    //         if (current.leftChild == null){
    //             return current;
    //         } else current = current.leftChild;
    //     } return null;
    // }

    Nodes findMaximum() {
        Nodes current = root;
        while (current!=null) {
            if (current.rightChild == null){
                return current;
            } else current = current.rightChild;
        } return null;
    }

    Nodes find(int val) {
        Nodes current = root;

        while(current!=null) {
            if(val == current.data) {
                return current;
            }
            if (val < current.data){
                current = current.leftChild;

            }else{
                current = current.rightChild;
            }
        } return null;
    }
    void insert(int val) {
        Nodes node = new Nodes(val);
        if(root == null) {
            root = node;
        }else{
            Nodes current = root;
            Nodes parent;

            while(true) {
                parent = current;
                if(val<current.data) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = node;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }                
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(25);
        tree.insert(5);
        tree.insert(21);



    }
}