import java.util.*;
public class wc172s4 {
	static int nodes,ans;
	static int [] temp = new int[401], arr  = new int[401];
	static int [][] dp = new int[401][401];
	static int recurse(int starti,int endi) {
		if(starti==endi)return 0;
		if(dp[starti][endi]!=0x3f3f3f3f)return dp[starti][endi];
		if(arr[starti]==arr[endi]) {
			dp[starti][endi] = recurse(starti+1,endi);
			return dp[starti][endi];
		}
		int x = 0x3f3f3f3f;
		for(int i=starti;i<endi;i++) {
			x=  Math.min(x,recurse(starti,i)+recurse(i+1,endi)+1);
		}
		dp[starti][endi] = x;
		return x;
	}
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	nodes = sc.nextInt();
	for(int i=0;i<nodes;i++)
		temp[i] = sc.nextInt();
	for(int i=1;i<nodes;i++) {
		if(temp[i]!=temp[i-1]) {
			arr[ans] = temp[i-1];
			ans++;
		}
	}
	if(temp[0]!=temp[nodes-1]) {
		arr[ans] = temp[nodes-1];
		ans++;
	}
	for(int i=0;i<dp.length;i++) {
		for(int j=0;j<dp.length;j++) {
			dp[i][j] = 0x3f3f3f3f;
		}
	}
	nodes = ans;
	System.out.println((ans+1)/2+" "+recurse(0,nodes-1));
}
}
