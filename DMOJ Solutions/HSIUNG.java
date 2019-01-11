import java.io.*;
import java.util.*;
public class HSIUNG{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int a = readInt(), b = readInt(), c = readInt(), dp[] = new int[c + 1]; dp[0] = 1;
    	for(int i = 0; i <= c; i++) {
    		if(dp[i] == 1) {
    			if(i + a <= c) dp[i + a] = 1;
    			if(i + b <= c) dp[i + b] = 1;
    		}
    	}
    	for(int i = c; i >= 0; i--) {if(dp[i] == 1) { pw.println(i); break;}} pw.close();
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
