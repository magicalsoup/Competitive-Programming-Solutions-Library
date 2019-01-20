import java.io.*;
import java.util.*;
public class MagicalBribery{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), dp[] = new int[n + 1], v[] = new int[n + 1]; 
    	for(int i = 1; i <= n; i++) v[i] = readInt();
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= i; j++) {
    			dp[i] = Math.max(dp[i], dp[i - j] + v[j]);
    		}
    	}
    	pw.println(dp[n]); pw.close(); 
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
