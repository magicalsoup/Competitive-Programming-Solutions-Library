import java.util.*;
import java.io.*;
    public class BobAndICSClass{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int a = solve(readInt()), b = solve(readInt()), c = solve(readInt());
    	  if(a == solve(readInt()) && b == solve(readInt()) && c == solve(readInt())) pw.println("Dull");
    	  else pw.println("Colourful"); pw.close();
      }
      static int solve(int a) {
    	  return (int)Math.sqrt(a);
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
