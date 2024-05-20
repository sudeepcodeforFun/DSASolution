
public class BSTDeleteANode {
    
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

    
    public static Node deleteNode(Node root, int val){
        if(root.data < val){
            root.right = deleteNode(root.right, val);
        }

        else if(root.data > val){
            root.left = deleteNode(root.left, val);
        }

        else{

            // leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // a node have only one child
            else if(root.right == null){
                return root.left;

            // a node have two child
            }else{
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
        }
        return root;
    }
    
    public static Node findInorderSuccessor(Node node) {
       while (node.left != null) {
            node = node.left;
       }
       return node;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }

        root= deleteNode(root, 5);
        inorder(root);
        
    }
}
