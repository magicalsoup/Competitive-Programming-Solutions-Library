package Douwei;
import java.util.Arrays;
import java.util.Scanner;
public class FindTheSumDP{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          
        int m = scan.nextInt();
        int arr[] = new int[m];
        for(int i = 0; i < m; i++){
            int n = scan.nextInt();
            arr[i] = n;
        }
        int dp[] = new int[m];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = Math.max(dp[0] + arr[2], dp[1]);
        for(int i=3;i<m;i++)
        {
            dp[i] = Math.max(Math.max(dp[i-2], dp[i-3]) + arr[i],dp[i-1]);
        }
        System.out.println(dp[m-1]);
    }
}
