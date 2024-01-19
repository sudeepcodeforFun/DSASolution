public class ClearRangeOfBit {
    
    public static int clearRangeOfBit(int n, int i, int j){

        int a = (~0<<j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 10, startPosition = 2, lastPosition = 3;
        System.out.println(clearRangeOfBit(n, startPosition, lastPosition));
    }
}
