package apr19;

public class practiceDelete {
    public void deleteNode(Node root, int data) {
        if (root == null) {
            return;
        }
        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        }else if (data > root.data) {
            root.right = deleteNode(root.left, data);
        } else {
            if (root.left == null && root.right == null){
                root = null;
            }
         else if (root.right == null) {
            root = root.left;
        } else if (root.left == null) {
            root = root.right;
        }

        else {
            Node temp = minValueNode(root.right);
            root.data = temp data;
            root.right = deleteNode(root.right, temp.data);
        }
        
    }


    public Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

}
