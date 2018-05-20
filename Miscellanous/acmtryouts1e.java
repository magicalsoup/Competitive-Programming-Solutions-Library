import java.util.*;
public class acmtryouts1e {
	static int dp[][]= new int[201][201];
	static int[]a = new int[201],b = new int[201];
	static int mod = 1000000007;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		memset(dp,0,201);
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		dp[0][0] = 1;
		for(int i=1;i<=n;i++) {
			for(int j=a[i];j<=b[i];j++) {
				for(int k=0;k<=m;k++) {
					if(k-j>=0) {
						dp[i][k] +=dp[i-1][k-j];
						dp[i][k] = dp[i][k]%mod;
					}
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}
public static void memset(int dp[][],int num,int size){
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			dp[i][j] = num;
		}
	}
}
}
