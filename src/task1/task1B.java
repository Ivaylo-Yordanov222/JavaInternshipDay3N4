package task1;
import java.util.Scanner;
public class task1B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        boolean isReverse = false;
        int k = 1;
        for (int i = 0; i < n; i++){
            if(!isReverse){
                for (int j = 0; j < n; j++)
                {
                    matrix[j][i] = k;
                    k++;
                }
                isReverse =true;
            }else{
                for (int j = n - 1; j >=0; j--)
                {
                    matrix[j][i] = k;
                    k++;
                }
                isReverse =false;
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
