package BST;

public class BinaryTree {

    public Node createNewNode(int k){
        Node node = new Node();
        node.data = k;
        node.left = null;
        node.right = null;

        return node;
    }

}
