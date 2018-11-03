import java.util.*;
import java.io.*;
    public class GelBananas{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  long a = readLong(), b = readLong(), x = readLong() - 1, div = lcm(a, b);
    	  pw.println(x / div + 1); pw.close();
      }
      static long gcd(long p, long q) { if(q == 0) return p; return gcd(q, p % q);}
      static long lcm(long a, long b) { return a * b / gcd(a ,b);}
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
