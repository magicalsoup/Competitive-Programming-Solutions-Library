package Douwei;
import java.util.*;
public class FunctionRunFun {
	static int dp[][][] = new int[21][21][21];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==-1&&b==-1&&c==-1)
				break;
			System.out.printf("w(%s, %s, %s) = %s\n",a,b,c,dfs(a,b,c));
		}
		sc.close();
	}
	static int dfs(int a,int b,int c) {
		if(a<=0||b<=0||c<=0)
			return 1;
		if(a>20||b>20||c>20)
			return 1048576;
		if(a<b&&b<c)
			dp[a][b][c] = dfs(a,b,c-1)+dfs(a,b-1,c-1)-dfs(a,b-1,c);
		else
			dp[a][b][c] = dfs(a-1,b,c)+dfs(a-1,b-1,c)+dfs(a-1,b,c-1)-dfs(a-1,b-1,c-1);
		return dp[a][b][c];
	}
}
