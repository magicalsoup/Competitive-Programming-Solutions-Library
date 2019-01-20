import java.util.*;
import java.io.*;
public class Frog2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(), k = readInt(), h[] = new int[n];
		for(int i = 0; i < n; i++) h[i] = readInt();
		int dp[] = new int[n + k + 1]; Arrays.fill(dp, 0x3f3f3f3f);
		dp[0] = 0;
		for(int i = 0; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i + j < n)
					dp[i + j] = Math.min(dp[i] + Math.abs(h[i] - h[i + j]), dp[i + j]);
			}
		}
		pw.println(dp[n - 1]); pw.close();
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
}
