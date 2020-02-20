package BST;

public class AlgebraOfNodes {

    public int getSumOfNodes(Node node){
        if (node == null){
            return 0;
        }

        return  node.data + getSumOfNodes(node.left) + getSumOfNodes(node.right);
    }

    public int differenceOfNodes(Node node){
        if (node == null){
            return 0;
        }

        return node.data - differenceOfNodes(node.left) - differenceOfNodes(node.right);
    }

    public int numberOfNodes(Node node){
        if (node == null){
            return 0;
        }

        return numberOfNodes(node.left) + numberOfNodes(node.right) + 1;
    }

    int count = 0;
    public int leafNodeCount(Node node){

        if (node == null){
            return 0;
        }

        if (node.left == null && node.right == null){
            count++;
        }
        leafNodeCount(node.left);
        leafNodeCount(node.right);

        return count;
    }

    public int heightOfTree(Node node){
        if (node == null){
            return 0;
        }

        return Math.max(heightOfTree(node.left) , heightOfTree(node.right)) +1;
    }
}
