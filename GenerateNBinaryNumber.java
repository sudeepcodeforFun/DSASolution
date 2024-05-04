import java.util.*;

public class QueueQuestion {

    public static String convertDecimalToBinary(int num) {
        String str = "";
        while (num > 0) {
            if ((num & 1) == 1) // 1
                str += '1';
            else // 0
                str += '0';
            num >>= 1; // Right Shift by 1
        }
        return str;
    }

    public static void generateBinaryNumber(int n) {
        Queue<String> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
        String str = convertDecimalToBinary(i);
        q.add(str);

        }
        while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        generateBinaryNumber(5);
    }
}

//Time complexity : O(n^2);  --brute force
//Time complexity : O(n)
