/**
 * GridWayWithMath
 */
public class GridWayWithMath {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n* fact(n-1);
    }
    public static int gridWay(int i, int j, int n, int m){

        if(i == n-1 || j == m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        return fact(n-1+m-1)/(fact(n-1)*fact(m-1));
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total number of ways :"+gridWay(0,0,n,m));
    }
}