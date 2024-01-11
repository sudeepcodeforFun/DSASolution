public class SearchIn2DArray {

    public static void staircaseSearch(int matrix[][], int key){
        //i = row and j = col
        int i = matrix.length-1, j=0;

        while (i>=0 && j<matrix[0].length) {
            if(matrix[i][j] == key){
                System.out.println("Key found at "+"("+i+","+j+")");
                return;
            }
            else if(matrix[i][j] < key){
                j++;
            }
            else{
                i--;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 51;
        staircaseSearch(matrix, key);   
    }
}
