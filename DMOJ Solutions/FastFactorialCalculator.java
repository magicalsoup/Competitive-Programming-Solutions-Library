import java.util.*;
import java.io.*;
    public class FastFactorialCalculator{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static final long MOD = 1L << 32;
      public static void main(String[]args) throws IOException{
    	  long n = readLong(); 	
    	  for(int i = 0; i < n; i++) {
    		  String x = next();
    		  if(x.length() > 2) { pw.println(0); continue;}
    		  long ans = 1; long y = Long.parseLong(x);
    		  for(int j = 2; j <= Math.min(y, 32); j++ ) ans = (ans * j) % MOD;
    		  pw.println(ans);
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
