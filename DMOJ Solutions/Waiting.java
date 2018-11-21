import java.util.*;
import java.io.*;
    public class Waiting{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s1[] = next().split(":"); int sec1 = 0;
    	  sec1 += Integer.parseInt(s1[0]) * 3600 + Integer.parseInt(s1[1]) * 60 + Integer.parseInt(s1[2]);
    	  String s2[] = next().split(":"); int sec2 = 0;
    	  sec2 += Integer.parseInt(s2[0]) * 3600 + Integer.parseInt(s2[1]) * 60 + Integer.parseInt(s2[2]);
    	  pw.println(sec2 - sec1); pw.close();  
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
