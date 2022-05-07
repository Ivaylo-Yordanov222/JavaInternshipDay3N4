import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentenceOne = sc.nextLine();
        String sentenceTwo = sc.nextLine();
        int max = 0;
        int m = sentenceOne.length();
        int n = sentenceTwo.length();
        int[][] dp = new int[m][n];
        int endIndex=-1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(sentenceOne.charAt(i) == sentenceTwo.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        // Add 1 to the diagonal value
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    if(max < dp[i][j])
                    {
                        max = dp[i][j];
                        endIndex=i;
                    }
                }
            }
        }

        String result =  sentenceOne.substring(endIndex-max+1,endIndex+1);
        System.out.println(result);
    }
}