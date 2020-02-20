package BST;

import java.util.LinkedList;
import java.util.Queue;

public class PrintingLevelWise {

    public void printAtGivenLevel(Node node, int level){

        if (node == null){
            return;
        }
        if (level == 1){
            System.out.print(node.data +" ");
        }

        printAtGivenLevel(node.left, level-1);
        printAtGivenLevel(node.right, level-1);
    }

    public void levelOrderQueue(Node node){
        if (node == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while (q.size()>0){
            Node top = q.remove();
            System.out.print(top.data + " ");

            if (top.left != null){
                levelOrderQueue(node.left);
            }
            if (top.right != null){
                levelOrderQueue(node.right);
            }
        }

    }
}
