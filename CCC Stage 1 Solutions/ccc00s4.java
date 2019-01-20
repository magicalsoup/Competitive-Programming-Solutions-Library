import java.util.Arrays;
import java.util.Scanner;
public class ccc00s4{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), n = sc.nextInt(); int dp[] = new int[d + 1], v[] = new int[n];
		for(int i = 0; i< n; i++) v[i] = sc.nextInt();
		dp[0] = 0; Arrays.fill(dp, 0x3f3f3f3f);
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= d; j++) {
				if(v[i] <= j)
					dp[j] = Math.min(dp[j], dp[j - v[i]] + 1);
			}
		}
		if(dp[d] == 0x3f3f3f3f) System.out.println("Roberta acknowledges defeat.");
		else System.out.println("Roberta wins in " + dp[d] + " strokes.");
		sc.close();
	}
}

