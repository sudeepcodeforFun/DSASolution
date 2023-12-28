public class BinarySearch {

    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]>key){
                end = mid-1;
            }
            else if(number[mid]<key){
                start = mid+1;
            }
            else if(number[mid]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8};
        int key = 7;
        if(binarySearch(number, key) == 1){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not Found");
        }
    }
}
