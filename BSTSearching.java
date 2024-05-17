import org.w3c.dom.Node;

public class BSTSearching {
    
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

    public static boolean searching(Node root, int data){
        if(root == null){
            return false;
        }

        if(root.data == data){
            return true;
        }

        if(root.data > data){
            return searching(root.left, data);
        }

        return searching(root.right, data);
    }
    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }
        if(searching(root, 11)){
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");
        }
        
    }
}
