import java.util.*;
import java.io.*;
    public class JaydenEatsChocolate{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); int x = readInt(), y = readInt(), z = readInt(), dp[] = new int[n + 1];
    	  for(int i = 0; i <= n; i++) {
    		  if(dp[i] == 0 && i != 0) continue;
    		  if(i + x <= n) dp[i + x] = Math.max(dp[i + x], dp[i] + 1);
    		  if(i + y <= n) dp[i + y] = Math.max(dp[i + y], dp[i] + 1);
    		  if(i + z <= n) dp[i + z] = Math.max(dp[i + z], dp[i] + 1);
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
