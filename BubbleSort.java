public class BubbleSort {

    public static void bubbleSort(int number[]){
        boolean flag;
        for(int i=0; i<number.length; i++){
            flag = false;
            for(int j = 0; j<number.length - i -1; j++){
                if(number[j] >number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }

    public static void printArray(int number[]){
        for(int i =0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number[] = {2,3,1,4,3,6};    // O(n2)
        int number1[] = {1,2,3,4,5};     // O(1)
        bubbleSort(number);
        bubbleSort(number1);
        printArray(number);
        printArray(number1);
    }
}
