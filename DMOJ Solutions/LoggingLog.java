import java.util.*;
import java.io.*;
    public class LoggingLog{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	 int d = readInt();
    	 for(int x = 1; x <= d; x++) {
    		 int t = readInt(), cnt = 0;
    		 for(int i = 0; i < t; i++) cnt+= readInt();
    		 if(cnt == 0) pw.println("Weekend");
    		 else pw.println("Day " + x + ": " + cnt);
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
