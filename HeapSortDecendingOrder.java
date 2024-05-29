public class HeapSortDecendingOrder {
    
    public static void heapify(int arr[], int i, int n){
        int leftCIdx = 2*i +1;
        int rightCIdx = 2*i + 2;
        int maxIdx = i;
        if(leftCIdx < n && arr[leftCIdx] < arr[maxIdx]){
            maxIdx = leftCIdx;
        }

        if(rightCIdx < n && arr[rightCIdx] < arr[maxIdx]){
            maxIdx = rightCIdx;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, n);
        }
    }
    public static void heapSort(int arr[]){

        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        for(int i=n-1; i>=1; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0, i);
        }
    }
    public static void main(String[]args){
        int arr[] = {4,3,7,9,2,6};
        heapSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
