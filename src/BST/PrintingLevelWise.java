package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintingLevelWise {

    AlgebraOfNodes algebra = new AlgebraOfNodes();

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

    public void levelWiseWithoutRecursion(Node node){
        if (node == null){
            return;
        }

        int level = algebra.heightOfTree(node);

        for (int i = 0; i<= level; i++){

            printAtGivenLevel(node,i+1);
            System.out.println();
        }

    }

    public void reverseLevelWiseWithoutRecursion(Node node){
        if (node == null){
            return;
        }

        int level = algebra.heightOfTree(node);

        for (int i = level; i>= 0; i--){

            printAtGivenLevel(node,i+1);
            System.out.println();
        }

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

    public void reverseLevelOrderQueue(Node node){
        if (node == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        Stack<Node> s = new Stack<>();
        q.add(node);

        while (q.size()>0){
            Node top = q.remove();
            s.push(top);

            if (top.right != null){
                levelOrderQueue(node.right);
            }
            if (top.left != null){
                levelOrderQueue(node.left);
            }

            while (!s.empty()){

                Node pop = s.pop();
                System.out.print(pop.data);
            }

        }
    }

    public void levelOrderQueueLineWise(Node node){
        if (node == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while (true){
            int count = q.size();
            if (count == 0){
                break;
            }
            while (count>0){
                Node top = q.remove();
                System.out.print(top.data + " ");

                if (top.left != null){
                    levelOrderQueue(node.left);
                }
                if (top.right != null){
                    levelOrderQueue(node.right);
                }
                count--;
            }

            System.out.println();
        }

    }
}
