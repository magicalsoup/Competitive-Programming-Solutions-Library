import java.io.*;
import java.util.*;
public class DrHenriandResponsibility{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), dp[] = new int[701 * 701], v[] = new int[n], sum = 0; 
    	for(int i = 0; i < n; i++) {v[i] = readInt(); sum += v[i];}
    	dp[0] = 1;
    	for(int i = 0; i < n; i++) {
    		for(int j = sum; j >= 0; j--) {
    			if(j >= v[i] && dp[j - v[i]] == 1)
    				dp[j] = 1;
    		}
    	}
    	int tot = (sum + 1)/2;
    	for(int i = tot; i >= 0; i--) {
    		if(dp[i] == 1) {pw.println(Math.abs(sum - i - i)); break;}
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
