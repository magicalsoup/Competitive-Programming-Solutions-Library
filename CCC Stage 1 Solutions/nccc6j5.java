import java.io.*;
import java.util.*;
public class nccc6j5{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static long dp[][];
    static final long mod = 998244353;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), k = readInt(), a[] = new int[n + 1]; dp = new long[n+1][k+1];
    	for(int i = 0; i <= n; i++) Arrays.fill(dp[i], -1);
    	for(int i = 1; i <= n; i++) a[readInt()]++;
    	
    	//for(int i : t) System.out.print(i + " ");
    	//System.out.println();
    	pw.println(solve(n, k, a)); pw.close();
    }
    static long solve(int n, int k, int a[]) {
    	if(k == 0) return 1;
    	if(n == 0) return 0;
    	if(dp[n][k] != -1) return dp[n][k] % mod;
    	return dp[n][k] = (solve(n - 1, k - 1, a) * a[n] % mod + solve(n - 1, k, a) % mod) % mod;
    }
	static String next () throws IOException {
  	  while (st == null || !st.hasMoreTokens())
  		  st = new StringTokenizer(br.readLine().trim());
  	  return st.nextToken();
    }
    
    static long readLong () throws IOException {
  	  return Long.parseLong(next());
    }

    static int readInt () throws IOException {
  	  return Integer.parseInt(next());
    }

    static double readDouble () throws IOException {
  	  return Double.parseDouble(next());
    }
    
    static String readLine () throws IOException {
  	  return br.readLine().trim();
    } 
}
