import java.util.*;
import java.io.*;
   public class dwite11c3p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++){
    		  int a = readInt(); int min = Integer.MAX_VALUE; String ans = "";
    		  for(int i = 0; i < 4; i++){ String name = next(); int weight = readInt(); if(Math.abs(a - weight) < min){ min = Math.abs(a - weight); ans = name;}}
    		  pw.println(ans);
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
