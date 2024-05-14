import java.util.LinkedList;
import java.util.Queue;

public class BinaryTranformToSumTree {
    
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

    public static int transformToSumTree(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);
        
        int value = root.data;
        int leftValue = 0;
        int rightValue = 0;
        if(root.left != null){
            leftValue = root.left.data;
        }
        if(root.right != null){
            rightValue = root.right.data;
        }
        root.data = leftValue + leftSum+ rightValue +rightSum;

        return value;

    }

    public static void levelOrderTraversal(Node root){
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
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Before");
        levelOrderTraversal(root);
        
        transformToSumTree(root);
        System.out.println();
        System.out.println("After");
        levelOrderTraversal(root);

    }
}
