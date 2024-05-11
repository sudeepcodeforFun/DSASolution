public class BinarySubtreeOfAnTree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }

    public static boolean isIdentical(Node node, Node subNode){
        if(node == null && subNode == null){
            return true;
        }
        if(node == null || subNode == null || node.data != subNode.data){
            return false;
        }
        if(!isIdentical(node.left, subNode.left)){
            return false;
        }
        if(!isIdentical(node.right, subNode.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
         subroot.left = new Node(4);
        subroot.right = new Node(5);
        subroot.left.left  = new Node(6);

        System.out.println("Subtree of another tree is:"+isSubtree(root, subroot));
    }
}