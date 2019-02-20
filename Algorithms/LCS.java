import java.util.*;
public class LCS {
	/**
	 * @NOTE: Remember, LCS always runs in O(n^2) time (best time complexity)
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(), b = sc.nextLine();
		int dp[][] = new int[a.length() + 1][b.length() + 1];
		System.out.println(findlen(dp, a, b));
		System.out.println(findword(dp, a, b));
		sc.close();
	}
	static int findlen(int dp[][], String a, String b) {
		int n = a.length(), m = b.length();
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
	static String findword(int dp[][], String a, String b) {
		String res = "";
		int i = a.length(), j = b.length();
		while(i > 0 && j > 0) {
			if(a.charAt(i - 1) == b.charAt(i - 1)) {
				res = a.charAt(i - 1) + res;
				i--; j--;
			}
			else if(dp[i - 1][j] > dp[i][j - 1]) i--;
			else j--;
		}
		return res;
	}
}
