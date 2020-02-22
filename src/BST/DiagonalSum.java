package BST;

import java.util.LinkedList;
import java.util.Queue;

public class DiagonalSum {

    public void getDiagonalSum(Node node){

        if (node == null){
            return;
        }

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);



        while (true){

            int size = nodeQueue.size();

            int s =0;

            while (size>0){

                Node temp = nodeQueue.remove();

                while (temp!=null){

                    s = s + temp.data;

                    if (temp.left!= null){
                        nodeQueue.add(temp.left);
                    }

                    temp = temp.right;
                }
                size--;
            }
            System.out.println(s + " ");
        }

    }
}
