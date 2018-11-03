import java.util.*;
import java.io.*;
    public class ccc18j3{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	 int a = readInt(), b = readInt(), c = readInt(), d = readInt(), g[][] = new int[5][5];
    	 g[0][0] = 0; g[0][1] = a; g[0][2] = a + b; g[0][3] = g[0][2] + c; g[0][4] = g[0][3] + d;
    	 g[1][0] = a; g[2][0] = a + b; g[3][0] = g[2][0] + c; g[4][0] = g[3][0] + d;
    	 for(int i = 1; i < 5; i++) {
    		 for(int j = 1; j < 5; j++) g[i][j] = Math.abs(g[i][0] - g[0][j]);
    	 }
    	 for(int i = 0; i < 5; i++) {
    		 for(int j = 0; j < 5; j++) pw.print(g[i][j] + " ");
    		 pw.println();
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
