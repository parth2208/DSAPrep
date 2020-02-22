package BST;

public class MaxSumForTwoLeaves {

    int maxSum =0;

    public int maxSumBetweenTwoLeavers(Node node){

        if (node == null){
            return 0;
        }

        if (node.left == null && node.right == null){
            return node.data;
        }

        int l = maxSumBetweenTwoLeavers(node.left);
        int r = maxSumBetweenTwoLeavers(node.right);

        if (node.left != null && node.right != null){
            int localSum = l+r+node.data;
            if (localSum > maxSum){
                maxSum = localSum;
            }

            return Math.max(l,r) + node.data;
        }

        return node.left != null ? l+node.data : r+node.data;

    }
}
