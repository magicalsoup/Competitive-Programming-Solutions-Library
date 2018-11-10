import java.util.*;
import java.io.*;
    public class dwite08c2p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  String res = "";
    		  for(int i = 0; i < 7; i++) {
    			  String s = next();  int cnt = 0;
    			  for(int j = 0; j < s.length(); j++) if(s.charAt(j) == '#') cnt++;
    			  res += cnt;
    		  }
    		  pw.println(res);
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
