import java.util.*;
import java.io.*;
    public class ShahirInABox{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); long maxx = -1, maxy = -1, minx = 1024, miny = 1024;
    	  while(n-- > 0) {
    		  int x = readInt(), y = readInt(); 
    		  maxx = Math.max(x, maxx); maxy = Math.max(y, maxy);
    		  minx = Math.min(x, minx); miny = Math.min(y, miny);
    	  }
    	  pw.println((maxx - minx) * (maxy - miny)); pw.close();
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
