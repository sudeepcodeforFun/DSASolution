public class QuickSort {

    public static void quickSort(int arr[], int si, int ei){

        if(si>= ei){
            return;
        }

        int pidx  = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        
        return i;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,8,6,1};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
