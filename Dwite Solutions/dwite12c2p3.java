import java.util.*;
import java.io.*;
    public class dwite12c2p3{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  int a = readInt(); pw.println(s(a));
    	  }
    	  pw.close();
      }
      static long s(int n) {
    	  if(n == 0 || n == 1 || n == 2) return 1;
    	  int dp[] = new int[n + 1]; dp[0] = 1; dp[1] = 1; dp[2] = 1;
    	  for(int i = 3; i <= n; i++) dp[i] = dp[i - 2] + dp[i - 3];
    	  return dp[n];
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
