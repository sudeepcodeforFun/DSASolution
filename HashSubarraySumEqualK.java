import java.util.HashMap;

public class HashSubarraySumEqualK {
    
    public static int subArraySumK(int arr[], int k){
        HashMap<Integer, Integer> hm  = new HashMap<>();

        int sum = 0;
        int len = 0;

        hm.put(0, 1);
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(hm.containsKey(sum-k)){
                len += hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return len;
    }
    public static void main(String[]args){
        int arr[] = {1,2,3};
        int k = 3;

        System.out.println("Total number of subarray which gives sum K = "+subArraySumK(arr, k));
    }
}
