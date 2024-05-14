import java.util.LinkedList;
import java.util.Queue;

public class BinaryInvertTree {
    
    static class Node {
    
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static Node invertTree(Node root){
        if(root == null){
            return root;
        }

        Node leftNode = invertTree(root.left);
        Node rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data + " ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    
    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Before invert");
        levelOrder(root);

        invertTree(root);
        System.out.println("After invert");
        levelOrder(root);

    }
}
