import java.util.*;
import java.io.*;
    public class wc181j3{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int a = readInt(), b = readInt(); pw.println(solve(a).equals(solve(b))? "Same":"Different"); pw.close();
      }
      static String solve(int a) {
    	  if(a >= 90 && a <= 100) return "A";
    	  else if(a >= 80 && a <= 89) return "B";
    	  else if(a >= 70 && a <= 79) return "C";
    	  else if(a >= 60 && a <= 69) return "D";
    	  else if(a >= 0 && a <= 50) return "F";
    	  return "-1";
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
