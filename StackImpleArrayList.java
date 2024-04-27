import java.util.ArrayList;

public class StackImpleArrayList {

    static class Stack {
        static ArrayList<Integer> al = new ArrayList<>();

        //isempty
        public static boolean isEmpty(){
            return al.size() == 0;
        }

        //push
        public static void push(int data){
            al.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = al.get(al.size()-1);
            al.remove(al.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            return al.get(al.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
