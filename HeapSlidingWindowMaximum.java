import java.util.PriorityQueue;

public class HeapSlidingWindowMaximum {
    
    static class Data implements Comparable<Data> {
    
        int val;
        int idx;
        public Data(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        
        public int compareTo(Data d2){
            return d2.val - this.val;
        }
    }

    public static void slidingWindowTechnique(int arr[], int k, int ans[]){

        PriorityQueue<Data> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Data(arr[i], i));
        }

        ans[0] = pq.peek().val;

        for(int i= k; i<arr.length; i++){
            while (pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }

            pq.add(new Data(arr[i], i));
            ans[i-k+1]= pq.peek().val;
        }
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int ans[] = new int[arr.length-k+1];
        slidingWindowTechnique(arr, k, ans);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
