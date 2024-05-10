public class BinaryCountOfNode {
    
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

    public static int countOfNode(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);

        return leftCount + rightCount + 1;
    }


    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Count of this tree is:"+countOfNode(root));
    }
}
