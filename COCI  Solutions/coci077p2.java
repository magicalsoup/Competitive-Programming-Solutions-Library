import java.util.*;
public class coci077p2 {
	static int dp[][] = new int[1010][1010];
	static int n, INF = 0x3f3f3f3f;
	static int w[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); w = new int[n + 1];
		for(int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
		for(int i = 1; i <= n; i++) w[i] = sc.nextInt();
		System.out.println(solve(2, 1));
		sc.close();
	}
	static int solve(int p, int len) {
		if(p < 1 || p > n) return INF;
		if(dp[p][len] >= 0) return dp[p][len];
		if(p == n) return dp[p][len] = w[n];
		dp[p][len] = w[p] + Math.min(solve(p - len, len), solve(p+len+1, len + 1));
		return dp[p][len];
		
	}
}
