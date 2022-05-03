package task1;
import java.util.Scanner;

public class task1A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){
        int k = 1 + i;
           for (int j = 0; j < n; j++)
           {
               matrix[i][j] = k;
               k+=n;
           }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
