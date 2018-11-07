import java.util.*;
import java.io.*;
    public class IOI101{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String a = next(), res = "";
    	  for(int i = 0; i < a.length(); i++) res += convert(a.charAt(i));
    	  pw.println(res); pw.close();
      }
      static char convert(char c) {
    	  switch(c) {
	    	  case '0': return 'O';
	    	  case '1': return 'l';
	    	  case '3': return 'E';
	    	  case '4': return 'A';
	    	  case '5': return 'S';
	    	  case '6': return 'G';
	    	  case '8': return 'B';
	    	  case '9': return 'g';
	    	  default: return c;
    	  }
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
