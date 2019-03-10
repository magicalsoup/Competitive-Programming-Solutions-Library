import java.util.*;
public class Slimes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); long dp[][] = new long[n + 1][n + 1];
		long psa[] = new long[n + 1];
		for(int i = 1; i <= n; i++) {
			psa[i] = sc.nextInt(); dp[i][i] = psa[i]; psa[i] += psa[i - 1];
		}
		for(int i = 1; i < n; i++) {
			for(int l = 1; l + i <= n; l++) {
				int r = l + i; long min = 0x3f3f3f3f3f3fL;
				for(int k = l; k < r; k++) {
					 min = Math.min(min, getSum(l, r, psa) + dp[l][k] + dp[k + 1][r]);
				}
				dp[l][r] = min;
			}
		}
		System.out.println(dp[1][n] - getSum(1, n, psa));
		sc.close();
	}
	static long getSum(int l, int r, long psa[]) {
		return psa[r] - psa[l - 1];
	}
}
