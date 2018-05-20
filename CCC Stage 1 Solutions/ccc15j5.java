import java.util.*;
public class ccc15j5{
	static int[][][] dp = new int[250][250][250];
	public static int pi(int n,int k, int min) {
		if(n==k||k==1)return 1;
		if(!(n>0&&k>0)||k>n)return 0;
		int count =0;
		int temp;
		for(int i = min;i<=n/k;i++) {
			if(dp[n-i][k-1][i]==0) {
				temp = pi(n-i,k-1,i);
				count+=temp;
				dp[n-i][k-1][i] = temp;
			}
			else {
				count+=dp[n-i][k-1][i];
			}
		}
		return count;
	}
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int k= scan.nextInt();
	System.out.println(pi(n,k,1));
}
}
