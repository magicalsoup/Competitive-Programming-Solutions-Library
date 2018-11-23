import java.util.*;
import java.io.*;
    public class FestiveFardin{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String s1 = readLine(), s2 = readLine(); 
    	  if((s1.equals("red") || s1.equals("green") || s1.equals("white")) && (s2.equals("red") || s2.equals("green") || s2.equals("white")))
    		  pw.println("Jingle Bells");
    	  else pw.println("Boring..."); pw.close();
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
