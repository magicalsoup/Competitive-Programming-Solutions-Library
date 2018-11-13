import java.util.*;
import java.io.*;
   public class dwite09c6p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	  for(int t = 0; t < 5; t++){
    		  char[] c = readLine().toCharArray();
    		  for(char s : c){ if(Character.isAlphabetic(s)) pw.print(alpha.charAt((s + 26) % 26)); else pw.print(s);} pw.println();
    	  }
    	  pw.close();
      }
      static String reverse(String str){
    	  return new StringBuilder(str).reverse().toString();
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
