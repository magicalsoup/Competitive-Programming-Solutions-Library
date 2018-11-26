import java.util.*;
import java.io.*;
    public class ANewPrimeFactorization{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
  		int x = readInt();
		for(int i = 2; i <= (int)Math.sqrt(x); i++) {
			while (x % i == 0) {
				pw.println(i); x /=i;
			}
		}
		if(x!=1) pw.print(x);
		pw.println(); pw.close(); 
  		
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
