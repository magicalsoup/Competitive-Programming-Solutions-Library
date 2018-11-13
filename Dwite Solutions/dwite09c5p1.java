import java.util.*;
import java.io.*;
   public class Dwite{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++){
    		  int a = readInt(); 
    		  if(a < 0){ for(int i = 0; i < a + 5; i++) pw.print("-"); for(int i = 0; i < -a; i++) pw.print("*"); pw.print("|-----");}
    		  else{ pw.print("-----|"); for(int i = 0; i < a; i++) pw.print("*"); for(int i = 0; i < 5 - a; i++) pw.print("-");}
    		  pw.println();
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
