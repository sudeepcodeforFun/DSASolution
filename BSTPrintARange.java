
public class BSTPrintARange {
    
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

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data<= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if( root.data < k1){
            printInRange(root.left, k1, k2);   
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    
    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }
      
        printInRange(root, 2, 7);
        
    }
}
