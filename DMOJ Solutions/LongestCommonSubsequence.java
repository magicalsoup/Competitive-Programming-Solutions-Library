import java.util.*;
public class LongestCommonSubsequence {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(); int dp[][] = new int[1010][1010];
		int x[] = new int[n + 1], y[] = new int[m + 1];
		for(int i = 1; i <= n; i++) x[i] = sc.nextInt();
		for(int i = 1; i <= m; i++) y[i] = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(x[i] == y[j])
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		System.out.println(dp[n][m]);
		sc.close();
	}
}
