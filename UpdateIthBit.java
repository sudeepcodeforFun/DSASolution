public class UpdateIthBit {

    public static int setIthBit(int n, int i){

        int bitMask = (1<<i);
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){

        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    
    public static int updateIthBit(int n, int i, int newBit){

        if(newBit == 0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int newBit = 0;
        System.out.println(updateIthBit(n, i, newBit));
    }
}
