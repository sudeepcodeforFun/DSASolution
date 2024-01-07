public class SearchingIn2D {

    // searching funtion
    public static void searching(int arr[][], int key, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                //this is the condition for searching the element
                if (arr[i][j] == key) {
                    System.out.println("Key found at :" + "(" + i + "," + j + ")");
                    return;
                } 
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int TwoDArray[][] = { { 1, 2 }, { 3, 4 } };
        ;
        int n = 2, m = 2;

        // display the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }
        int key = 3;
        System.out.println();
        searching(TwoDArray, key, n, m);
    }
}
