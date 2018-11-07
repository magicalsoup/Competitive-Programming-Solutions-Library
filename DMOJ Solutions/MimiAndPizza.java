import java.util.*;
import java.io.*;
    public class MimiAndPizza{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	int b = readInt(), p = readInt(); boolean v = next().charAt(0) == 'Y';
    	if(p * 5 <= b) {
    		if(v) pw.println("B");
    		else pw.println("A");
    	}
    	else if(p * 2 <= b) {
    		if(v) pw.println("D");
    		else pw.println("C");
    	}
    	else pw.println("NO PIZZA"); pw.close();
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
