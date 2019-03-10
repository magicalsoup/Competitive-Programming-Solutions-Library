import java.util.*;
public class Deque {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int a[] = new int[n + 1]; long psa[] = new long[n + 1];
		long dp[][] = new long[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			psa[i] = sc.nextInt(); dp[i][i] = psa[i]; psa[i] += psa[i - 1];
		}
		for(int i = 1; i < n; i++) {
			for(int l = 1; l + i <= n; l++) {
				int r = l + i;
				dp[l][r] = getSum(l, r, psa) - Math.min(dp[l + 1][r], dp[l][r - 1]); 
			}
		}
		System.out.println(dp[1][n] - (getSum(1, n, psa) - dp[1][n]));
		sc.close();
	}
	static long getSum(int l, int r, long psa[]) {
		return psa[r] - psa[l - 1];
	}
}
