import java.util.*;
import java.io.*;
public class AdmiralKuznetsov{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt(); 
		//in.readLine();
		char a[] = next().toCharArray(), b[] = next().toCharArray();
		int pa[] = new int[n+1], pb[] = new int[n+1];
		for(int i=1; i<=n; i++) {
			if(a[i-1] == '0') pa[i] = 1;
			if(b[i-1] == '1') pb[i] = 1;
			pa[i] += pa[i-1];
			pb[i] += pb[i-1];
		}
		
		int dp[] = new int[n+2]; Arrays.fill(dp, 0x3f3f3f3f);
		dp[0] = 0;

		for(int i=1; i<=n; i++) {
			if(a[i-1] == b[i-1]) dp[i] = Math.min(dp[i], dp[i-1]);
			if(a[i-1] == '0' && b[i-1] == '1')  dp[i] = Math.min(dp[i], dp[i-1] + 1);
			
			if(i >= 3) dp[i] = Math.min(dp[i], dp[i-3] + 1 + pa[i] - pa[i-3] + pb[i] - pb[i-3]);
			
			if(i >= 4) dp[i] = Math.min(dp[i], dp[i-4] + 1 + pa[i] - pa[i-4] + pb[i] - pb[i-4]);
			if(i >= 5) dp[i] = Math.min(dp[i], dp[i-5] + 3 + pa[i] - pa[i-5] + pb[i] - pb[i-5]);
		}
		System.out.println(dp[n]);
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
