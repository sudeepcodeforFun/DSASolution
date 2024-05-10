public class BinaryDiameterOfTreeA2 {

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

    static class Info{
        int diameter;
        int height;
        Info(int d, int h){
            diameter = d;
            height = h;
        }
    }
    public static Info diameterOfTree(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameterOfTree(root.left);
        Info rightInfo = diameterOfTree(root.right);

        int selfInfo = Math.max(leftInfo.height+rightInfo.height+1,Math.max(leftInfo.diameter, rightInfo.diameter));

        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(selfInfo, ht);
    }
    
    public static void main(String[]args){
        Node root =  new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of a given tree:"+diameterOfTree(root).diameter);
    }
}
