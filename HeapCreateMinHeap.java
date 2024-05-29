import java.util.ArrayList;

/**
 * HeapCreateMinHeap
 */
public class HeapCreateMinHeap {

    static class MinHeap{

        // heap created
        ArrayList<Integer> arr = new ArrayList<>();

        //add in min heap
        public void add(int val){
            arr.add(val);

            int x = arr.size()-1;
            int par = (x-1)/2;

            //fixing minHeap
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        //remove element
        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);

            heapify(0);

            return data;
        }

        private void heapify(int i) {
            
            int leftCIdx = 2*i+1;
            int rightCIdx = 2*i+2;

            int minIdx = i;

            if(leftCIdx < arr.size() && arr.get(minIdx) > arr.get(leftCIdx)){
                minIdx = leftCIdx;
            }

            if(rightCIdx < arr.size() && arr.get(minIdx) > arr.get(rightCIdx)){
                minIdx = rightCIdx;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
            
        }

        public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[]args){
        MinHeap h = new MinHeap();
        h.add(3);
        h.add(1);
        h.add(5);
        h.add(8);
        h.add(2);

        while (!h.isEmpty()) {
            System.out.print(h.peek()+" ");
            h.remove();
        }

    }
}