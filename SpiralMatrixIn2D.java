public class SpiralMatrixIn2D {

    public static void spiralMatrix2D(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top border
            for (int i = startCol; i <=endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
            }

            // right border
            for (int i = startRow+1; i <=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            // bottom border
            for (int i = endCol-1; i>= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }

            // left border
            for (int i = endRow-1; i>= startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            // adjusting the pointer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }


    public static void main(String[] args) {
        int spiralMatrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        spiralMatrix2D(spiralMatrix);
    }
}
