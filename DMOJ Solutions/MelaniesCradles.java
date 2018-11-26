import java.util.*;
import java.io.*;
    public class MelaniesCradles{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int r = readInt(), cnt = 1;
    	  for(int x = -r; x < 0; x++) {
    		  for(int y = -r; y < 0; y++) 
    			  if(x * x + y * y <= r * r) cnt++;
      	  }
    	  cnt = 4 * cnt + 4 * r - 3; pw.println(cnt); pw.close(); 
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
