import java.util.ArrayList;

public class BSTIsValidate {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }

        return root;
    }


    public static boolean isValidateBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && min.data >= root.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidateBST(root.left, min, root) && isValidateBST(root.right, root, max);
    }
    
    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }
       

        if(isValidateBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    
    }
}
