public class GetIthBit {

    public static int getItheBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getItheBit(5,2));
    }
}
