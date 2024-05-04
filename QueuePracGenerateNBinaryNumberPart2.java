import java.util.*;

public class PracticeQuestionQueue {

    public static void generateBinaryNumber(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        generateBinaryNumber(5);
    }
}

//Time Complexity - O(n) and space - O(n)
