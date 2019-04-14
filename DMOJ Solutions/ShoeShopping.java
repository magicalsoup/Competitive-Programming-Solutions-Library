import java.util.*;
public class ShoeShopping {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double dp[] = new double[n+1]; int a[] = new int[n+1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
	
		for(int i = 1; i <= n; i++) {
			
			dp[i] = dp[i-1] + a[i];
			
			if(i >= 2)
				dp[i] = Math.min(dp[i], dp[i-2] + Math.max(a[i-1], a[i]) + Math.min(a[i-1], a[i])/2.0);
			
			if(i >= 3) {
				int b[] = new int[3];
				b[0] = a[i-2];
				b[1] = a[i-1];
				b[2] = a[i];
				Arrays.sort(b);
				dp[i] = Math.min(dp[i], dp[i-3] + b[2] + b[1]);
			}
		}
		System.out.printf("%.1f\n", dp[n]);
		sc.close();
	}
}
