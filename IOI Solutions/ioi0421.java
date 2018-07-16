import java.util.*;
import java.io.*;
public class ioi0421 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int w = readInt();
		int h = readInt();
		int n = readInt();
		int dp[][] = new int[w+1][h+1];
		for(int i=1;i<=w;i++) 
			for(int j=1;j<=h;j++) 
				dp[i][j] = i*j;
		for(int i=1;i<=n;i++) 	
			dp[readInt()][readInt()] = 0;
		for(int i=1;i<=w;i++) 
			for(int j=1;j<=h;j++) {
				for(int k=1;k<=i/2;k++)
					dp[i][j] = Math.min(dp[i][j], dp[k][j]+dp[i-k][j]);
				for(int k=1;k<=j/2;k++)
					dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[i][j-k]);
			}
		pw.println(dp[w][h]);
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
