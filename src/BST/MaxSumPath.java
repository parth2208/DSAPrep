package BST;

public class MaxSumPath {

    int maxSum = 0;

    public int getMaxSumPath(Node node){

        if (node == null){
            return 0;
        }

        if (node.left == null && node.right == null){

            return node.data;
        }

        int l = getMaxSumPath(node.left);
        int r = getMaxSumPath(node.right);

        int max_one = Math.max(node.data, node.data + Math.max(l, r));

        int max_two = Math.max(max_one , l+r+node.data);

        maxSum = Math.max(max_two, maxSum);

        return max_one;
    }
}
