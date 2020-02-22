package BST;

import sun.font.DelegatingShape;

public class IsSubTree {

    public boolean getIsSubTree(Node main, Node sub, int mainNodes, int subNodes){

        if (main == null){
            return false;
        }
        if (sub == null){
            return true;
        }

        int mainInorder[] = new int[mainNodes];
        inOrder(main,mainInorder);

        int subInorder[] = new int[subNodes];
        inOrder(sub,subInorder);

        String mainString = arrayToString(mainInorder);
        String subString = arrayToString(subInorder);

        if (!mainString.contains(subString)){
            return false;
        }

        int mainPreOrder[] = new int[mainNodes];
        preOrder(main, mainPreOrder);

        int subPreOrder[] = new int[subNodes];
        preOrder(sub,subPreOrder);

        String mainPreString = arrayToString(mainPreOrder);
        String subPreString = arrayToString(subPreOrder);

        if (mainPreString.contains(subPreString)){
            return true;
        }

        return false;
    }

    private String arrayToString(int[] arr){
        String s = "";

        for (int i=0; i<arr.length; i++){
            s = s + arr[i];
        }
        return s;
    }



    int i;
    private void inOrder(Node node, int[] arr){

        if (node == null){
            return;
        }

        inOrder(node.left,arr);
        arr[i++] = node.data;
        inOrder(node.right,arr);
    }

    private void preOrder(Node node, int[] arr){
        if (node ==  null){
            return;
        }

        arr[i++] = node.data;
        preOrder(node.left,arr);
        preOrder(node.right,arr);
    }
}
