import java.util.*;
public class PresentDeliveryPart1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int dp[] = new int[m + 1], a[] = new int[n + 1] ;
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		dp[0] = 1;
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j < n; j++) {
				if(dp[i] == 1) {
					if(i + a[j] <= m)
						dp[i + a[j]] = 1;
				}
			}
		}
		
		for(int i = m; i >= 0; i--) {
			if(dp[i] == 1) {
				int ans = 0x3f3f3f3f;
				for(int j = 0; j < n; j++) {
					int ans1 = Math.abs(m - i);
					int ans2 = Math.abs(m - (i + a[j]));
					int min = Math.min(ans1, ans2);
					ans = Math.min(ans, min);
				}
				System.out.println(ans);
				break;
			}
		}
		sc.close();
	}
}
