import java.util.*;
public class ccc07s5{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
	int[] scores = new int[T];
	for(int t=0;t<T;t++)
	{
		int N = scan.nextInt();
		int K = scan.nextInt();
		int W = scan.nextInt();
		int[] pins=  new int[N];
		int [][] dp = new int[K+1][N];
		for(int n=0;n<N;n++)
			pins[n] = scan.nextInt();
		for(int k=1;k<=K;k++)
			for(int n =0;n<N;n++)
			{
				int score = 0;
				for(int i=n;i>n-W&&i>=0;i--)
					score+=pins[i];
				dp[k][n] = Math.max((n>0? dp[k][n-1]:0),(W<=n? dp[k-1][n-W]:0)+score);
			}
		scores[t] = dp[K][N-1];
	}
	for(int t= 0;t<T;t++)
		System.out.println(scores[t]);
}
}
