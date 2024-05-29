import java.util.ArrayList;

public class HeapCreateMaxHeap {
     static class MaxHeap{


        // heap created
        ArrayList<Integer> arr = new ArrayList<>();

        //add in min heap
        public void add(int val){
            arr.add(val);

            int x = arr.size()-1;
            int par = (x-1)/2;

            //fixing minHeap
            while (arr.get(x) > arr.get(par)) {
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

            int maxIdx = i;

            if(leftCIdx < arr.size() && arr.get(maxIdx) < arr.get(leftCIdx)){
                maxIdx = leftCIdx;
            }

            if(rightCIdx < arr.size() && arr.get(maxIdx) < arr.get(rightCIdx)){
                maxIdx = rightCIdx;
            }

            if(maxIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(maxIdx);
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
        MaxHeap h = new MaxHeap();
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
