package Douwei;
import java.math.BigInteger;
import java.util.Scanner;
 
public class CalculationForInteger {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for (int t = 0; t < k; t++) {
            String n = s.next();
            int m = s.nextInt();
            int l = n.length();
 
            BigInteger[][] dp = new BigInteger[l + 1][m + 1];
            for (int i = 0; i <= l; i++)
                for (int j = 0; j <= m; j++) {
                    dp[i][j] = BigInteger.ZERO;
                }
 
            dp[0][0] = BigInteger.ONE;
 
            for (int j = 0; j < m; j++)
                for (int i = 0; i < l; i++)
                    for (int p = i + 1; p <= l; p++) {
                        dp[p][j + 1] = dp[p][j + 1].max(dp[i][j].multiply(new BigInteger(n.substring(i, p))));
                    }
 
            System.out.println(dp[l][m]);
        }
        s.close();
    }
}
