package BST;

public class IfSumTree {

    public boolean ifSum(Node node){

        if (node== null || ifLeafNode(Node node))  {
            return false;
        }

        int leftSum;
        int rightSum;

        if (ifSum(node.left) && ifSum(node.right)){
            if (node.left == null)
                leftSum = 0;

            else if (ifLeafNode(node.left)) {
                leftSum = node.left.data;
            }
            else
                leftSum = 2*node.left.data;

            if (node.right == null){
                rightSum = 0;
            } else if (ifLeafNode(node.right)){
                rightSum = node.right.data;
            } else
                rightSum = 2* node.right.data;

            if (node.data == rightSum + leftSum){
                return true;
            }else {
                return false;
            }
        }

        return false;
    }

    private boolean ifLeafNode(Node node){
        if (node == null){
            return false;
        }

        if (node.left == null && node.right == null){
            return true;
        }
        return false;
    }
}
