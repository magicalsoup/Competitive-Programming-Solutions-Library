import java.util.*;
import java.io.*;
    public class dwite11c5p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  int n = readInt(), cnt = 0; for(int i = 1; i <= n; i++) cnt += factors(i);
    		  pw.println(cnt);
    	  }
    	  pw.close();
      }
      static int factors(int n) {
    	  int cnt = 0;
    	  for(int i = 1; i <= Math.sqrt(n); i++) if(n % i == 0) cnt++;
    	  return cnt;
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
