import java.util.*;
public class StackNextGreater {

    public static int[] nexGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nexGreaterArray[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                nexGreaterArray[i] = -1;
            }else{
                nexGreaterArray[i] = arr[s.peek()];
            }

            s.push(i);
        }
        return nexGreaterArray;
    }
    public static void main(String[]args){
        int arr[] = {6,8,0,1,3};
        int arr1[] = nexGreater(arr);
        for(int i=0; i<arr1.length-1; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
