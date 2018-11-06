import java.util.*;
import java.io.*;
    public class Yoda{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s = readLine(), part1 = "", part2 = "", end = s.charAt(s.length() - 1) + "";
    	  part1 = s.substring(0, s.indexOf(",")); part2 = s.substring(s.indexOf(","), s.length() - 1);
    	  if(part1.length() > 0) part1 = part1.substring(0, 1).toLowerCase() + part1.substring(1);
    	  if(part1.length() > 0) part2 += " "; String convert = part2.substring(1) + part1 + end; 
    	  pw.println(convert.substring(1, 2).toUpperCase() + convert.substring(2)); pw.close();
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
