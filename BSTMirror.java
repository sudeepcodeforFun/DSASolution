public class BSTMirror {
    
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
    
    public static Node mirrorBST(Node root){
        if(root == null){
            return root;
        }

        Node rightNode = mirrorBST(root.right);
        Node leftNode = mirrorBST(root.left);

        root.left = rightNode;
        root.right = leftNode;

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
    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }
  
        root = mirrorBST(root);
        preOrder(root);
    
    }
}
