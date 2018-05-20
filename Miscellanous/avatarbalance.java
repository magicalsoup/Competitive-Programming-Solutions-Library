import java.util.*;
public class avatarbalance {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[]nums = new int[n+1];
	int sum =0;
	for(int i=1;i<=n;i++) {
		nums[i] = sc.nextInt();
		sum+=nums[i];
	}
	boolean[] dp = new boolean[sum/2+1];
	dp[0] = true;
	int max =0;
	for(int y=1;y<nums.length;y++) {
		for(int x=dp.length-1;x>=1;x--) {
			if(x-nums[y]>=0&&dp[x-nums[y]]) {
				dp[x] = true;
				max = Math.max(x, max);
			}
		}
	}
	System.out.println((sum-max)-max);
}
}
