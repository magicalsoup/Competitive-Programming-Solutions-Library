import java.util.*;
import java.io.*;
    public class FrenchHomework{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s1 = next(), s2 = next(), aux = "";
    	  if(s2.charAt(s2.length() - 1) == 'e') aux = "la";
    	  else if(s2.charAt(s2.length() - 1) == 's') aux = "les";
    	  else aux = "le";
    	  pw.println(s1 + "-tu " + aux + " " + s2 + " ?"); pw.close();
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
