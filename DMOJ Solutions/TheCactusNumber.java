import java.util.*;
import java.io.*;
    public class TheCactusNumber{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); int max = -1; for(int i = 0; i < n; i++) max = Math.max(max, readInt()); 
    	  if(max > 10000) pw.println("Something is wrong with these cuteness values");
    	  else if(max > 1000) pw.println("Cuteness by definition is similarity to Cactus");
    	  else pw.println("Cuteness by definition is similarity to Carol"); pw.close();
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
