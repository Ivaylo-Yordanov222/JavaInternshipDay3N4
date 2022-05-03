package task1;
import java.util.Scanner;
public class task1C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int row = 0;
        int col = 0;
        boolean rowsIncrement = false;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                matrix[row][col] = k;
                k++;
                if (j + 1 == i){
                    break;
                }
                if (rowsIncrement) {
                    row++;
                    col--;
                } else {
                    row--;
                    col++;
                }
            }

            if (i == n){
                break;
            }

            if (rowsIncrement) {
                row++;
                rowsIncrement = false;
            } else {
                col++;
                rowsIncrement = true;
            }
        }
        // Update the indexes of row and col variable
        if (row == 0) {
            if (col == n - 1){
                row++;
            }
            else{
                col++;
            }
            rowsIncrement = true;
        } else {
            if (row == n - 1){
                col++;
            }
            else{
                row++;
            }
            rowsIncrement = false;
        }
        //fill in right from diagonal

        for (int i, diagonal = n - 1; diagonal > 0; diagonal--) {
            if (Math.min(diagonal,n)==n){
                i = n;
            }
            else{
                i = diagonal;
            }
            for (int j = 0; j < i; j++) {
                matrix[row][col] = k;
                k++;
                if (j + 1 == i){
                    break;
                }
                if (rowsIncrement) {
                    row++;
                    col--;
                } else {
                    col++;
                    row--;
                }
            }

            // Update the indexes of row and col variable
            if (row == 0 || col == n - 1) {
                if (col == n - 1){
                    row++;
                }
                else{
                    col++;
                }
                rowsIncrement = true;
            }

            else if (col == 0 || row == n - 1) {
                if (row == n - 1){
                    col++;
                }
                else{
                    row++;
                }
                rowsIncrement = false;
            }
        }

        //Print the matrix
       for (int i = 0; i < n; i++){
           for (int j = 0; j < n; j++)
           {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }
}
