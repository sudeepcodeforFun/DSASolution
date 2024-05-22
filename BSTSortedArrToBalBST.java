public class BSTSortedArrToBalBST {
    
    static class Node {
        
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right =  null;
        }
        
    }

    public static Node balancedBST(int arr[], int st, int end){

        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = balancedBST(arr, st, mid-1);
        root.right = balancedBST(arr, mid+1, end);

        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6};
        Node root = balancedBST(arr, 0, arr.length-1);

        preOrder(root);
    }
}
