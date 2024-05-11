import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTopViewOfTree {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;   
            this.left = null;
            this.right = null;     
        }
    }

    static class Info{
        int hd;
        Node node;
        public Info(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        //level order traversal
        q.add(new Info(0, root));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.hd-1, curr.node.left));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Info(curr.hd+1, curr.node.right));
                    max = Math.max(max, curr.hd+1);
                }

            }
        }
    
        for(int i = min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
    }

    public static void main(String[]args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        /*
         *          1
         *         /  \
         *        2    3
         *       / \   /
         *      4   5 6
         * 
         */

        //output 4 2 1 3
        topView(root);
    }
}
