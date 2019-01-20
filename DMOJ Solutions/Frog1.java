import java.io.*;
import java.util.*;
public class Frog1{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), dp[] = new int[n + 1], v[] = new int[n + 1];
    	for(int i = 0; i < n; i++) v[i] = readInt();
    	for(int i = 0; i < n - 2; i++) {
    		dp[i + 1] = Math.min(dp[i] + Math.abs(v[i] - v[i + 1]), dp[i + 1]);
    		dp[i + 2] = Math.min(dp[i] + Math.abs(v[i] - v[i + 2]), dp[i + 2]);
    	}
    	pw.println(Math.min(dp[n - 2] + Math.abs(v[n - 2] - v[n-  1]), dp[n - 1])); pw.close();
    }
    static int abs(int a, int b) {
    	return Math.abs(a - b);
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
