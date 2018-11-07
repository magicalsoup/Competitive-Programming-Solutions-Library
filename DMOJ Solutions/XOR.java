import java.util.*;
import java.io.*;
    public class XOR{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int s;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); 
    	  /*for(int i = 1; i <= n; i++) {
    		  System.out.println("XOR " + i + " " + (sum ^= i));
    	  }*/
    	  while(n-- > 0) {
    		  int s = readInt(), f = readInt(); pw.println(convert(f) ^ convert(s - 1));
    	  }
    	  pw.close();
      }
      static int convert(int x) {
    	  int a[] = {1, x + 1, 0, x};
    	  return a[(x+1)% 4];
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
