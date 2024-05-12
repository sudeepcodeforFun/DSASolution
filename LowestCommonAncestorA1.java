import java.util.ArrayList;

public class LowestCommonAncestorA1 {
    
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

    public static boolean getPath(Node root, int n, ArrayList<Node> arr){
        if(root == null){
            return false;
        }

        arr.add(root);

        if(root.data == n){
            return true;
        }

        boolean leftPath = getPath(root.left, n, arr);
        boolean rightPath = getPath(root.right, n, arr);

        if(leftPath || rightPath){
            return true;
        }

        arr.remove(arr.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getPath(root, n1, p1);
        getPath(root, n2, p2);

        int i = 0;
        for(; i<p1.size() && i<p2.size(); i++){
            if(p1.get(i) != p2.get(i)){
                break;
            }
        }

        return p1.get(i-1);
    }

    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        int n1 = 4, n2 = 1;
        System.out.println(lca(root, n1, n2).data);
    }
}
