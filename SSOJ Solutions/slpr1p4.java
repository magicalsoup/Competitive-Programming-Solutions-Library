import java.util.*;
public class slpr1p4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(); int dp[] = new int[k + 1];
		int w[] = new int[n + 1], v[] = new int[n + 1];
		for(int i = 1; i <= n; i++) {w[i] = sc.nextInt(); v[i] = sc.nextInt();}
		for(int i = 1; i <= n; i++) {
			for(int j = k; j >= w[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
			}
		}
		System.out.println(dp[k]);
		sc.close();
	}
}
