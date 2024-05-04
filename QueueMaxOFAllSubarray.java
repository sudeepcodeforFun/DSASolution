public static void maxOfAllSubarray(int n, int k, int arr[]){
        for(int i=0; i<n-2; i++){
            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];

            if(a>b && a>c){
                System.out.print(a+" ");
            }
            else if(b>a && b>c){
                System.out.print(b+" ");
            }else{
                System.out.print(c+" ");
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // int k  = 5;
        // int size = arr.length;
        // reverseFirstKElement(size, k, arr);
        // for(int i=0; i<size; i++){
        //     System.out.print(arr[i]+" ");
        // }

        int n=9, K=3; 
        int arr[]= {1, 2, 3, 1, 4, 5, 2, 3, 6};
        maxOfAllSubarray(n, K, arr);
    }

//Time complexity = O(n) Space Complexity = O(1);
