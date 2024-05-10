public class BinaryDiameterOfTree {
    
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

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diameterOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSubTreeDiam = diameterOfTree(root.left);
        int rightSubTreeDiam = diameterOfTree(root.right);
        int leftSubTreeHeight = heightOfTree(root.left);
        int rightSubTreeHeight = heightOfTree(root.right);

        int selfDiameter = leftSubTreeHeight + rightSubTreeHeight + 1;

        return Math.max(selfDiameter, Math.min(leftSubTreeDiam, rightSubTreeDiam));
    }
    
    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of a given tree is:"+diameterOfTree(root));
        
    }
}
