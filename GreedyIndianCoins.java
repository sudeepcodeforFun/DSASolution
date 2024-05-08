public class GreedyIndianCoins {
    
    public static int calculateCoin(int arr[], int n){
        //no need to sort but if the coin array is not then we need to do
        int calCoin = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<=n){
                while (arr[i]<=n) {
                    calCoin++;
                    n -= arr[i];
                }
            }
        }
        return calCoin;
    }
    public static void main(String[]args){
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 101;
        System.out.println("Minimum number of denomination = "+calculateCoin(coins, amount));
    }
}
