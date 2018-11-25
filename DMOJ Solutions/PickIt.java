import java.util.*;
import java.io.*;
    public class PickIt{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int dp[][];
      static int a[];
      public static void main(String[]args) throws IOException{
    	  while(true) {
    		  int n = readInt(); if( n == 0) break; a = new int[201]; dp = new int[201][201];
    		  for(int i = 1; i <= n; i++) a[i] = readInt();
    		  for(int d = 2; d < n; d++) {
    			  for(int l = 1; l <= n - d; l++) {
    				  int r = l + d;
    				  for(int k = l + 1; k < r; k++) {
    					  dp[l][r] = Math.max(dp[l][r], dp[l][k] + dp[k][r] + a[l] + a[r] + a[k]);
    				  }
    			  }
    		  }
    		 pw.println(dp[1][n]);
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
