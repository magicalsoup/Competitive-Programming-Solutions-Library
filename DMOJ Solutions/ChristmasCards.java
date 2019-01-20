import java.io.*;
import java.util.*;
public class ChristmasCards{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), c[] = new int[n], d[] = new int[n]; long dp[] = new long[n];
    	for(int i = 0; i < n; i++) { c[i] = readInt(); d[i] = readInt();} Arrays.fill(dp, 0x3f3f3f3f3f3f3f3fL); dp[0] = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = n - 1; j > i - 1 ; j--) {
    				dp[Math.min(j + d[i],  n - 1)] = Math.min(dp[Math.min(j + d[i], n - 1)], dp[j] + c[i]);
    		}
    	}
    	pw.println(dp[n - 1]); pw.close();
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
