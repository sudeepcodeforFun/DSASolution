/**
 * GridWays
 */
public class GridWays {
    public static int gridWay(int i, int j, int n, int m){

        if(i == n-1 || j == m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        int way1 = gridWay(i+1, j, n, m);  //down
        int way2 = gridWay(i, j+1, n, m); //right
        return way1+way2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total number of ways :"+gridWay(0,0,n,m));
    }
}
