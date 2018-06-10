import java.util.*;
public class prac3p4{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt(); // volume
			int n = sc.nextInt(); // number of buckets
			if(m==0&&n==0)
				break;
			int buckets[] = new int[n];
			for(int i=0;i<n;i++)
				buckets[i] = sc.nextInt();
			int ans = solve(m,buckets,n);
				System.out.println(ans);
		}
		sc.close();
	}
	public static int solve(int m,int [] buckets, int n) {
		// dynamic programming 
		int [] dp = new int[m+1];
		dp[0] = 0;
		int min,t;
		for(int x=1;x<=m;x++) 
		{
			min = Integer.MAX_VALUE;
			for(int j=0;j<n;j++)
			{
				t = x-buckets[j];
				if(t>=0&&dp[t]>=0&&dp[t]<min)
					min = dp[t];
			}
			if(min<Integer.MAX_VALUE)
				dp[x] = min+1;
			else
				dp[x]= - 1;
		}
		return dp[m];
	}
}
