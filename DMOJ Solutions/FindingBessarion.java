import java.util.*;
import java.io.*;
    public class FindingBessarion{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	 int n = readInt(); String a[] = new String[n]; boolean flag = false;
    	 for(int i = 0; i < n; i++) a[i] = readLine();
    	 for(int i = 0; i < n - 2; i++) {
    		 if((a[i].equals("Bayview") || a[i].equals("Leslie")) && a[i + 1].equals("Bessarion") || (a[i + 2].equals("Bayivew") || a[i + 2].equals("Leslie"))) flag = true; 
    	 }
    	 if(flag) pw.println("Y"); else pw.println("N");
    	 pw.close();
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
