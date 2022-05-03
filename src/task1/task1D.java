package task1;
import java.util.Scanner;
public class task1D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        spiralFill(n, n, matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralFill(int m, int n, int[][] matrix) {
        int row = 0;
        int col = 0;
        int k = 1;

        while (row < m && col < n) {
            for (int i = col; i < n; ++i) {
                matrix[row][i] = k++;
            }
            row++;
            for (int i = row; i < m; ++i) {
                matrix[i][n - 1] = k++;
            }
            n--;

            if (row < m) {
                for (int i = n - 1; i >= col; --i) {
                    matrix[m - 1][i] = k++;
                }
                m--;
            }

            if (col < n) {
                for (int i = m - 1; i >= row; --i) {
                    matrix[i][col] = k++;
                }
                col++;
            }
        }
    }
}


