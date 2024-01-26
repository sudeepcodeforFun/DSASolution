public class TilingProblem {

    public static int tiling(int n){
        if(n==0|| n==1){
            return 1;
        }

        int totalways = tiling(n-1) + tiling(n-2);
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
