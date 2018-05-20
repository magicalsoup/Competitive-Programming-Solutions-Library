import java.util.*;
public class coci064p4 {
	static final int MOD = 1000000007;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int dp[][] = new int[2][10001];
	dp[1][0] = 1;
	for(int i=2;i<=n;i++) {
		int tmp = 0;
		for(int j=0;j<=k;j++) {
			tmp = (tmp+dp[(i-1)&1][j])%MOD;
			if(j>=i)
				tmp = (tmp-dp[(i-1)&1][j-i]+MOD)%MOD;
			dp[i&1][j] = tmp;
		}
	}
	System.out.printf("%d\n", dp[n&1][k]);
}
}
