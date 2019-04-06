import java.util.*;
import java.io.*;
public class coci14c7p3 {
	/*
	 * {0,1 2} {1,0,2} {1,2,0} {0,2,1} {2,0,1} {2,1,0}  
	 */
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int N = readInt(), dp[][] = new int[N][3];
		int a[][] = new int[N][3];
		for(int i = 0; i < N; i++) 
			a[i][0] = readInt();
		for(int i = 0; i < N; i++) 
			a[i][1] = readInt();
		for(int i = 0; i < N; i++) 
			a[i][2] = readInt();
		
		int ans = 0x3f3f3f3f;
        dp[0][0] = a[0][0];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][0] + dp[i - 1][0];
            dp[i][1] = a[i][1] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][2] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N - 1][2]);
        
        dp = new int[N][3];
        dp[0][0] = a[0][1];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][1] + dp[i - 1][0];
            dp[i][1] = a[i][0] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][2] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N-1][2]);
        
        dp = new int[N][3];
        dp[0][0] = a[0][1];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][1] + dp[i - 1][0];
            dp[i][1] = a[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N-1][2]);
        
        dp = new int[N][3];
        dp[0][0] = a[0][0];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][0] + dp[i - 1][0];
            dp[i][1] = a[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][1] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N-1][2]);
        
        dp = new int[N][3];
        dp[0][0] = a[0][2];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][2] + dp[i - 1][0];
            dp[i][1] = a[i][0] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][1] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N-1][2]);
        
        dp = new int[N][3];
        dp[0][0] = a[0][2];
        dp[0][1] = dp[0][2] = dp[1][2] = 0x3f3f3f3f;
        for (int i = 1; i < N; i++) {
            dp[i][0] = a[i][2] + dp[i - 1][0];
            dp[i][1] = a[i][1] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][2] = a[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        }
        ans = Math.min(ans, dp[N-1][2]);
        
        System.out.println(ans);
		
	}
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}
