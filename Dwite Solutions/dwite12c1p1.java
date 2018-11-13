import java.util.*;
import java.io.*;
   public class dwite12c1p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++){
    			int n = readInt();
    			for (int i = 1; i < n; i++) { for (int j = 0; j < i; j++) pw.print("*"); pw.println();}
    			for (int i = n; i >= 1; i--) { for (int j = 0; j < i; j++) pw.print("*"); pw.println();}
    	  }
    	  pw.close();
      }
      static void print(String s, int n){
    	  for(int i = 0; i < n; i++) pw.print(s);
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
