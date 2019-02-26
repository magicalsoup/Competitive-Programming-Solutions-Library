import java.util.*;
public class RestoringReputation {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(), I = sc.nextInt(), R = sc.nextInt();
		String a = sc.next(), b = sc.next(); 
		int dp[][] = new int[a.length() + 1][b.length() + 1];
		
		for(int i = 0; i <= a.length(); i++) dp[i][0] = i *  D;
		for(int i = 0; i <= b.length(); i++) dp[0][i] = i * I;
		
		for(int i = 1; i <= a.length(); i++) {
			for(int j = 1; j <= b.length(); j++) {
				if(a.charAt(i - 1) == b.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
				else
					dp[i][j] = Math.min(dp[i][j - 1] + I, Math.min(dp[i - 1][j] + D, dp[i - 1][j - 1] + R));
			}
		}
		System.out.println(dp[a.length()][b.length()]); sc.close();
	}
}
