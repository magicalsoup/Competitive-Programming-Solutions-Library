import java.util.Scanner;
public class LongestCommonSubsequence {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(); 
		String a = sc.next(), b = sc.next();
		int dp[][] = new int[a.length() + 1][b.length() + 1];
		System.out.println(findlen(dp, a, b, n, m));
		sc.close();
	}
	static int findlen(int dp[][], String a, String b, int n, int m) {

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(a.charAt(i - 1) == b.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[n][m];
	}
}
