import java.io.*;
import java.util.*;
public class Knapsack2{
	/**
	 * @NOTE: use this when w is big and v is small
	 */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int MAXN = 105, MAXV = (int)1e3 + 5;
    public static void main(String[]args) throws IOException{
    	int N = readInt(), W = readInt(); int w[] = new int[N + 1], v[] = new int[N + 1];
    	long dp[] = new long[MAXN * MAXV + 1]; Arrays.fill(dp, 0x3f3f3f3f3f3f3f3fL);
    	for(int i = 0; i < N; i++) {
    		w[i] = readInt();
    		v[i] = readInt();
    	}
    	dp[0] = 0; 
    	for(int i = 0; i < N; i++)
    		for(int j = MAXN * MAXN - 1; j >= v[i]; j--)
    			dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
    	
    	for(int i = MAXN * MAXV - 1; i >= 0; i--) {
    		if(dp[i] <= W) {
    			pw.println(i);
    			pw.close();
    			return;
    		}
    	}
    	pw.close();
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
