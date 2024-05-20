import java.util.ArrayList;

public class BSTRootToLeaf {
    
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

    
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);
        
        if(root.left == null && root.right == null){
            printValue(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);

    }
    
    private static void printValue(ArrayList<Integer> path) {
    
        for(int i=0; i<path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        int value[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }

        ArrayList<Integer> path = new ArrayList<>();
        printRootToLeaf(root, path);
    
    }
}
