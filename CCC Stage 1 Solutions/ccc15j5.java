import java.util.*;
public class ccc15j5{
	static int[][] dp = new int[250][250];
	public static int pi(int n, int k) {
		if(n < 0 || (k==0 && n != 0)) return 0;
		if(n == 0 && k != 0) return 1;
		if(dp[n][k] != 0) return dp[n][k];
		return dp[n][k] = pi(n, k - 1) + pi(n - k, k);
	}
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println(pi(n - k, k));
	}
}
