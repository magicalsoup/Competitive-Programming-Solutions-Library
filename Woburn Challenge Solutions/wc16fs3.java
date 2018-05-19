import java.util.*;
public class wc16fs3 {
	static final int inf = 0x3f3f3f3f;
	static int[][] dp = new int[401][402];
	static int[] c = new int[400];
	static int n,k;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	 k = sc.nextInt();
	 for(int i=0;i<n;i++) {
		 c[i] = sc.nextInt();
	 }
	 memset();
	 dp[0][0] = 0;
	 for(int i=0;i<n;i++) {
		 for(int j=i;j<n;j++) {
			 int C = j-i+1;
			 int t =0;
			 for(int k=i;k<=j;k++) {
				 t+= Math.max(0, C-c[k]-1);
			 }
			 for(int l=0;l<=k;l++) {
				 dp[j+1][l+1] = Math.min(dp[j+1][l+1],dp[i][l]+t);
			 }
		 }
	 }
	 System.out.println(dp[n][k+1]);
}
static void memset() {
	for(int i=0;i<dp.length;i++) {
		for(int j=0;j<dp[i].length;j++) {
			dp[i][j] = inf;
		}
	}
}
}
