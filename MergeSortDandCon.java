public class MergeSortDandCon {

    public static void mergeSort(int arr[], int sidx, int eidx){
        if(sidx >= eidx){
            return;
        }

        int mid = sidx+(eidx-sidx)/2;
        mergeSort(arr, sidx, mid);    // calling for left subarray
        mergeSort(arr, mid+1, eidx);  // calling for right subarray
        merge(arr, sidx, mid, eidx);
    }

    public static void merge(int arr[], int sidx, int mid, int eidx){

        int temp[]  = new int[eidx-sidx+1];
        int i = sidx;
        int j = mid+1;
        int k = 0;

        //comparing the two subarray and which one smaller is adding to the temporary array
        while (i<=mid && j<=eidx) {
            
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if there is some left element in left subsorted array 
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        // if there is some left element in right subsorted array 
        while (j<=eidx) {
            temp[k++] = arr[j++];
        }

        // copying the data
        for(k =0, i = sidx; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
