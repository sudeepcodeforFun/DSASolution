public static void reverseFirstKElement(int n,int k, int arr[]){
        Deque<Integer> d = new LinkedList<>();

        for(int i=0; i<k; i++){
            d.addLast(arr[i]);
        }
        for(int i=0; i<k; i++){
            arr[i] = d.removeLast();
        }
        
    }
 public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int k  = 5;
        int size = arr.length;
        reverseFirstKElement(size, k, arr);
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

//Time Complexity = O(n) and Space complexity = O(n);
