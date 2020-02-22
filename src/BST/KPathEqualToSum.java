package BST;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class KPathEqualToSum {

    public void printKPathEqualToSum(Node node, int val){

        ArrayList<Integer> list = new ArrayList<>();

        if (node == null){
            return;
        }

        list.add(node.data);

        printKPathEqualToSum(node.left,val);
        printKPathEqualToSum(node.right,val);

        int sum = 0;

        for (int i = list.size()-1; i>=0 ; i--){

            sum = sum + list.get(i);

            if (sum == val){

                for (int j = i; i<= list.size()-1;i++){

                    System.out.println(list.get(j)+ " ");

                }

                System.out.println();

            }
        }

        list.remove(list.size()-1);

    }
}
