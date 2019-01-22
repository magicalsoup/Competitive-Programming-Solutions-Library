import java.util.*;
import java.io.*;
    public class Vacation{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), dp[][] = new int[n + 1][3], a[][] = new int[n + 1][3]; int max = 0;
    	  for(int i = 1; i <= n; i++) {a[i][0] = readInt(); a[i][1] = readInt(); a[i][2] = readInt();}
    	  
    	  for(int i = 1; i <= n; i++) {
    		  for(int j = 0; j < 3; j++) {
    			  for(int k = 0; k < 3; k++) {
    				 if(k != j)
    					  dp[i][k] = Math.max(dp[i][k], dp[i - 1][j] + a[i][k]);
    			  }
    		  }
    	  }
    	  for(int i = 0; i <= n; i++) {
    		  for(int j = 0; j < 3; j++) {
    			//  System.out.print(dp[i][j]+" ");
    			  max = Math.max(max, dp[i][j]);
    		  }
    		  //System.out.println();
    	  }
    	  pw.println(max); pw.close();
      }
      static double divide(int a, int b){
    	  return (double)(a / b);
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
