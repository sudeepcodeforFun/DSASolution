public class SortingWithCounting {
    

        public static void countingSort(int arr[]){
    
            //finding the range
            int largest = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                largest = Math.max(largest, arr[i]);
            }
    
            //creating an countArray
            int countArray[] = new int[largest+1];

            //count the frequency
            for(int i=0; i<arr.length; i++){
                countArray[arr[i]]++;
            }
    
            //now arranging the element of array with the counting logic
            int j = 0;
            for(int i=0; i<countArray.length; i++){
                while(countArray[i]>0){
                    arr[j] = i;
                    j++;
                    countArray[i]--;
                }
            }
        }
        public static void main(String []args){
            int arr [] = {1,2,4,3,6,3,7};
            countingSort(arr);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    

