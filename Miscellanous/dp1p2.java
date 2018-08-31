import java.util.*;
public class dp1p2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int coin[] = new int[n];
	for(int i=0;i<n;i++)
		coin[i] = sc.nextInt();
	
	int[][]dp = new int [n][n];
	
	for(int i=0;i<n;i++)
	{
		for(int j=i;j>=0;j--)
		{
			if(j==i)
				dp[i][j] = coin[i];
			else
			{
				for(int k=j;k<=i;k++)
					dp[i][j]+=coin[k];
				dp[i][j]-=dp[i][j+1]>dp[i-1][j]?dp[i-1][j]:dp[i][j+1];
			}
		}
	}
	System.out.println(dp[n-1][0]);
}
}
