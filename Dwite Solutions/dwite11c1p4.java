import java.util.*;
import java.io.*;
    public class dwite11c1p4{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  long n = readLong(); long cnt = 0;
    		  for(int i = 0; i <= n; i ++) cnt += index(i);
    		  pw.println(cnt);
    	  }
    	  pw.close();
      }
      static int index(int n) {
    	  String s = String.valueOf(n); int ret = 0;
    	  for(int i = 0; i < s.length(); i++) { 
    		  if(s.charAt(i) == '0') ret++;
    	  }
    	  return ret;
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
