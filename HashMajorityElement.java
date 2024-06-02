import java.util.HashMap;
import java.util.Set;

public class HashMajorityElement {
    
    public static int majorityElement(int arr[]){

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }

        int ans = 0;
        Set<Integer> keySet = hm.keySet();
        for (Integer kInteger : keySet) {
            if(hm.get(kInteger)>arr.length/3){
                ans = kInteger;
            }
        }

        return ans;
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,5,1,3,1,5,1};
        System.out.println("Majority Value "+majorityElement(arr));
    }
}
