
public class ZigZagLL {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        // to avoid this loop we need tail pointer
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse the 2nd half list
        Node curr = mid.next;
        Node prev = null;
        Node next;
        mid.next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternate merge
        Node left = head;
        Node right  = prev;
        Node nextL, nextR;

        while(left!=null && right!= null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[]args){
        ZigZagLL ll = new ZigZagLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
