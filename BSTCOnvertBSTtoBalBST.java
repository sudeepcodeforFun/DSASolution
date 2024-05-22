import java.util.ArrayList;

public class BSTCOnvertBSTtoBalBST {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
        
    }

    public static Node convertBSTtoBalBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = convertBSTtoBalBST(arr, st, mid-1);
        root.right = convertBSTtoBalBST(arr, mid+1, end);

        return root;

    }

    public static void preOrder(Node root){
        if (root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[]args){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);

        root = convertBSTtoBalBST(arr, 0, arr.size()-1);
        preOrder(root);
    }
}
