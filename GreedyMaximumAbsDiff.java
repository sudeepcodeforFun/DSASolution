import java.util.Arrays;

public class GreedyMaximumAbsDiff {

    public static int maximumAbsDifference(int A[], int B[]){
        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsDiff = 0;

        for(int i=0; i<A.length; i++){
            minAbsDiff += Math.abs(A[i]-B[i]);
        }

        return minAbsDiff;
    }
    public static void main(String[]args){
        int arr1[] = {1,2,3};
        int arr2[] = {2,1,3};

        System.out.println("Minimum absolute Difference = "+maximumAbsDifference(arr1, arr2));
    }
}
