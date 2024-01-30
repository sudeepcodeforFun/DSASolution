/*
 * Print all binary string of size n without consecutive onces.
 * 
 * example if n =3 then.
 *  000
    001
    010
    100
    101

    As you can see that there is no consucutive ones
 */



public class BinaryStringRecursion {

    public static void binaryString(int n, int lastPos, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        binaryString(n-1, 0, str+"0");
        if(lastPos == 0){
            binaryString(n-1, 1, str+"1");
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        binaryString(n, 0, "");
    }
}
