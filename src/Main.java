import BST.*;

public class Main {

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        TreeTraversal traversal = new TreeTraversal();
        AlgebraOfNodes sum = new AlgebraOfNodes();
        PrintingLevelWise levelWise = new PrintingLevelWise();
        KPathEqualToSum pathEqualToSum = new KPathEqualToSum();
        MaxSumPath maxSumPath = new MaxSumPath();
        MaxSumForTwoLeaves twoLeaves = new MaxSumForTwoLeaves();
        DiagonalSum diagonalSum = new DiagonalSum();

        Node root = tree.createNewNode(2);
        root.left = tree.createNewNode(7);
        root.right = tree.createNewNode(5);
        root.left.left = tree.createNewNode(2);
        root.left.right = tree.createNewNode(6);
        root.left.right.left = tree.createNewNode(5);
        root.left.right.right = tree.createNewNode(11);
        root.right.right = tree.createNewNode(9);
        root.right.right.left = tree.createNewNode(4);

        System.out.print("Inorder: ");
        traversal.inOrder(root);
        System.out.println();

        System.out.print("Preorder: ");
        traversal.preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        traversal.postOrder(root);
        System.out.println();

        System.out.println(sum.getSumOfNodes(root));
        System.out.println(sum.differenceOfNodes(root));
        System.out.println(sum.numberOfNodes(root));
        System.out.println(sum.leafNodeCount(root));
        System.out.println(sum.heightOfTree(root));

//        levelWise.printAtGivenLevel(root, 3);
        levelWise.levelOrderQueue(root);
        levelWise.levelWiseWithoutRecursion(root);
        levelWise.reverseLevelWiseWithoutRecursion(root);
        levelWise.reverseLevelOrderQueue(root);
        System.out.println();

        levelWise.levelOrderQueueLineWise(root);
        System.out.println(
        );

        pathEqualToSum.printKPathEqualToSum(root,11);

        System.out.println();
        int finalSum = maxSumPath.getMaxSumPath(root);

        System.out.println(finalSum);
        System.out.println(
        );

        int finals = twoLeaves.maxSumBetweenTwoLeavers(root);
        System.out.println(finals + " ");
        System.out.println("This is for diagonal");

//        diagonalSum.getDiagonalSum(root);

    }
}
