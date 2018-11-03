import java.util.*;
public class RoundingToFibonacci {
	static int dp[] = new int[50];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		dp[0] = 0; dp [1] = 1;
		for(int i = 2; i < 50; i++) { dp[i] = dp[ i- 1] + dp[i - 2]; }
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			int tmp = Integer.MAX_VALUE;
			int ans = 0;
			for(int j = 1; j < dp.length; j++) {
				if(dp[j] >= n) tmp = Math.min(tmp , Math.min(Math.abs(dp[j] - n), Math.abs(dp[j - 1] - n)));
				if(tmp == Math.abs(dp[j] - n)) ans = dp[j];
				if(tmp == Math.abs(dp[j - 1] - n)) ans = dp[j - 1];
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
