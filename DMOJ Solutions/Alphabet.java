import java.util.*;
public class Alphabet {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), a = "abcdefghijklmnopqrstuvwxyz"; 
		int dp[][] = new int[s.length() + 1][a.length() + 1];
		int n = s.length(), m = a.length();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(s.charAt(i - 1) == a.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else 
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);	
			}
		}
		System.out.println(26 - dp[n][m]);
		sc.close();
	}
}
