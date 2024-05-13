public class BinaryMinimumDistanceBtTwoNode {
    
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

    public static Node lowestCommonAncestor(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftNode = lowestCommonAncestor(root.left, n1, n2);
        Node righNode = lowestCommonAncestor(root.right, n1, n2);

        if(leftNode == null){
            return righNode;
        }

        if(righNode == null){
            return leftNode;
        }

        return root;
    }

    public static int getDistance(Node root, int n ){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDistance = getDistance(root.left, n);
        int rightDistance = getDistance(root.right, n);

        if(leftDistance == -1 && rightDistance == -1){
            return -1;
        }else if(leftDistance == -1){
            return rightDistance + 1;
        }else{
            return leftDistance+1;
        }

    }

    public static int minimumDistBtTwoNode(Node root, int n1, int n2){

        Node lca = lowestCommonAncestor(root, n1, n2);

        int dist1 = getDistance(lca, n1);
        int dist2 = getDistance(lca, n2);

        return dist1+dist2;

    }


    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        System.out.print(minimumDistBtTwoNode(root, n1, n2));
    }
}
