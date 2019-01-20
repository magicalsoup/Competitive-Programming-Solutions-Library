import java.io.*;
import java.util.*;
public class NotEnoughTime{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), t = readInt(), dp[] = new int[t + 1];
    	int p[][] = new int[n][3], v[][] = new int[n][3];
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < 3; j++) {
    			p[i][j] = readInt(); v[i][j] = readInt();
    		}
    	}
    	for(int i = 0; i < n; i++) {
    		for(int j = t; j >= 0; j--) {
    			for(int k = 0; k < 3; k++) {
    				if(p[i][k] <= j)
    				dp[j] = Math.max(dp[j], dp[j - p[i][k]] + v[i][k]);
    			}
    		}
    	}
    	pw.println(dp[t]); pw.close();
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
