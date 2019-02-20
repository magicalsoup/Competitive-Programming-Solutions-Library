import java.io.*;
import java.util.*;
public class Knapsack1{
	/**
	 * @NOTE: use this when N is small and W is big
	 */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), w = readInt(); long value[] = new long[n + 1]; int weight[] = new int[n + 1];
    	long dp[] = new long[w + 1];
    	for(int i = 1; i <= n; i++) { 
    		weight[i] = readInt(); 
    		value[i] = readLong();
    	}
    	for(int i = 1; i <= n; i++) {
    		for(int j = w; j >= weight[i]; j--) {
    			dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
    		}
    	}
    	pw.println(dp[w]); pw.close();
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
