import java.util.*;
import java.io.*;
    public class coci17c4p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), k = readInt(), ans = 0, lamp = 0;
    	  for(int i = 0; i < m; i++) {
    		  int x = readInt(), t = x - k - 1; if(t > lamp) { ans += (t - lamp + 2 * k) / (2 * k + 1);}
    		  lamp = x + k;
    	  }
    	  if(lamp < n) ans += (n - lamp + 2 * k) / (2 * k + 1); pw.println(ans); pw.close();
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
