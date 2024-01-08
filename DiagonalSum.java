public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){

        int sum = 0;
        for(int i=0; i<=matrix.length-1;i++){
            
            //primaray diagonal sum
            sum += matrix[i][i];

            //Secondary Diagonal sum
            if(i!=matrix.length-i-1){        // this is codition of overlapping when the odd matrix will given
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[]args){
        int spiralMatrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Diagonal Sum :"+diagonalSum(spiralMatrix));
    }
}
