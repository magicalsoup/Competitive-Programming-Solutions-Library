import java.util.*;
import java.io.*;
    public class CCAndCheeseKun{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int w = readInt(), c = readInt(); 
    	  if(w == 3 && c >= 95) pw.println("C.C. is absolutely satisfied with her pizza.");
    	  else if(w == 1 && c <= 50) pw.println("C.C. is fairly satisfied with her pizza.");
    	  else pw.println("C.C. is very satisfied with her pizza.");
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
