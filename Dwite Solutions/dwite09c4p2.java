import java.util.*;
import java.io.*;
    public class dwite09c4p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  int n = readInt(); int a[] = new int[101];
    		  for(int i = 0; i < n; i++) a[readInt()]++;
    		  int max = a[0]; for(int x : a) max= Math.max(max, x);
    		  if(max * 2 > n) pw.println("verified");
    		  else {
    			  int ocur = 0; for(int x :a) if(x == max) ocur++;
    			  if(ocur == 1) pw.println("unverified");
    			  else pw.println("unknown");
    		  }
    	  }
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
