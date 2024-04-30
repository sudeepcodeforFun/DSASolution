import java.util.Stack;

public class StackMaxAreaHistogram {

    public static void maxAreaHist(int[]arr){

        Stack<Integer> s = new Stack<>();
        // next smaller right
        int [] nsr =  new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }


        // next smaller left

        s = new Stack<>();  // empty the string is any data is left in the stack 
        int [] nsl = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Max area histogram
        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currBarArea = height * width;
            maxArea = Math.max(maxArea, currBarArea);
        }

        System.out.println("max area of histogram = "+maxArea);
    }
    public static void main(String[]args){
        int arr[] = {2,1,5,6,2,3};
        maxAreaHist(arr);
    }
}
