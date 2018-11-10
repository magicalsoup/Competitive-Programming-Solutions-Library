import java.util.*;
import java.io.*;
    public class dwite08c1p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int height[] = new int[5]; String line[] = new String[5];
    	  for(int i = 0; i < 5; i++) line[i] = "";
    	  for(int i = 0; i < 5; i++) height[i] = readInt();
    	  for(int size : height) {
    		  for(int i = 0; i < 5; i++) {
    			  String temp = line[4 - i]; if(size == 0) temp += ".";
    			  else {
    				  int width = size * 2 - 1;
    				  int mid = Math.max(width - i * 2, 0);
    				  int side = (width - mid) / 2;
    				  temp += pack(".", side) + pack("x", mid) + (mid > 0 ? "" : ".") + pack(".",  side);
    			  }
    			  line[4 - i] = temp; 
    		  }
    	  }
    	  for(String s : line) pw.println(s);pw.close();      
      }
      static String pack(String s, int n) {
    	  String res = ""; for(int i = 0; i < n; i++) res += s; return res;
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
