import java.util.*;
import java.io.*;
    public class Redirection{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	 int n = readInt(), a[] = new int[n];
    	 for(int i = 0; i < n; i++) a[i] = next().length(); 
    	 int m = readInt(), b[] = new int[m]; 
    	 for(int i = 0; i < n; i++) {
    		 int min = Integer.MAX_VALUE, index = 0;
    		 for(int j = 0; j < m; j++) {
    			 if(b[j] < min) {min = b[j]; index = j;}
    		 }
    		 pw.println(index + 1); b[index] += a[i];
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
