import java.util.*;
 import java.io.*;
    public class wc182j4{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), s = readInt(); 
    	  if(s > 0) { for(int i = 0; i < n; i++) s += Math.min(readInt(), m);}
    	  pw.println(Math.min(s, n)); pw.close();
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
