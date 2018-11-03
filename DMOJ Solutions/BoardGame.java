import java.util.*;
import java.io.*;
    public class BoardGame{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
          String str = readLine(); int max = 0, count = 0, curMax = 0;
          for(int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == 'L') { count++; curMax++;} 
              else if (str.charAt(i) != ' '){ max = Math.max(max, curMax); curMax = 0;}
          }
          max = Math.max(max, curMax);
    	  	pw.println(count + " " + max); pw.close();
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
