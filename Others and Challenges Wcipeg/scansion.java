import java.util.*;
public class scansion {
static String str;
static final int mod = 10007;
static int[] dp = new int[10001];
static String feet = "0001,0010,0011,0100,0110,1000,1001";
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	str = scan.next();
	Arrays.fill(dp,-1);
	dp[0] =0;
	dp[1] = 1;
	dp[2] = 1;
	if(str.length()<=3)
	{
		System.out.println(dp[str.length()-1]);
		return;
	}
	String sub = str.substring(0, 4);
	dp[3] = (feet.contains(sub)?2:1);
	for(int i=4;i<str.length();i++)
	{
		dp[i]= dp[i-2]+dp[i-3];
		sub = str.substring(i-3,i+1);
		if(feet.contains(sub))
			dp[i]+=dp[i-4];
		dp[i] %= mod;
	}
	System.out.println(dp[str.length()-1]);
}
}
