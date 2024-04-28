import java.util.Stack;

public class StackReverseAStack {

    public static void pushAtBottom(Stack<Integer> s, int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int topEle  = s.pop();
        pushAtBottom(s, top);
        s.push(topEle);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[]args){
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
