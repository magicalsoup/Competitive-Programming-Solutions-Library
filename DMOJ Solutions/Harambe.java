import java.util.*;
import java.io.*;
    public class Harambe{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s = readLine(); int low = 0, up = 0;
    	  for(int i = 0; i < s.length(); i++) {
    		  char c = s.charAt(i);
    		  if(Character.isUpperCase(c)) up++;
    		  if(Character.isLowerCase(c)) low++;
    	  }
    	  if(up > low) pw.println(s.toUpperCase());
    	  else if(low > up) pw.println(s.toLowerCase());
    	  else pw.print(s); pw.close();
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
