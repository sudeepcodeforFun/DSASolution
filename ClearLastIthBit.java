public class ClearLastIthBit {
    
    public static int clearLastIthBit(int n, int i){

        int bitMask = (~0<<i);
        return n & bitMask;
    }
    public static void main(String []args){
        int n = 5, i = 2;
        System.out.println(clearLastIthBit(n, i));
    }
}
