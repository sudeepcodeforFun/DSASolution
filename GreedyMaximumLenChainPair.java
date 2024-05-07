import java.util.Arrays;
import java.util.Comparator;

public class GreedyMaximumLenChainPair {

    public static int maxLenghtChainPair(int arr[][]){
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));

        int maxLen = 1;
        int lastEnd = arr[0][1];

        for(int i=1; i<arr.length; i++){
            if(arr[i][0] >lastEnd){
                maxLen++;
                lastEnd = arr[i][1];
            }
        }
        return maxLen;
    }
    public static void main(String[]args){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println("Maximum length of chain = "+maxLenghtChainPair(pairs));
    }
}
