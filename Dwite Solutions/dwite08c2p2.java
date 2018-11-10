import java.util.*;
import java.io.*;
    public class dwite08c2p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  String s = next(); pw.println(biggestDigit(s));
    	  }
    	  pw.close();
      }
      static int biggestDigit(String s) {
    	  int max = -1;
    	  for(int i = 0; i < s.length(); i++) {
    		  if(Integer.parseInt(s.charAt(i)+"") > max) max = Integer.parseInt(s.charAt(i) + "");
    	  }
    	  return max;
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
