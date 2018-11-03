import java.util.*;
import java.io.*;
    public class Test{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), a[][] = new int[n][n];
    	  for(int i = 0; i < n; i++) {
    		  for(int j = 0; j < n; j++) a[i][j] = readInt();
    	  }
    	  for(int x = 0; x < 4; x++) {
    		  rot(a);
    		  if(solve(a)) {
    			  for(int i = 0; i < n; i++) {
    				  for(int j = 0; j < n; j++) {
    					  System.out.print(a[i][j] + " ");
    				  }
    				  System.out.println();
    			  }
    			  System.exit(0);
    		  }
    	  }
      }
      static void solve1(int a[][]) {
    	  for(int i = 0; i < a.length; i++) {
    		  for(int j = i + 1; j < a.length; j++) {
    			  int temp = a[i][j]; a[i][j] = a[j][i]; a[j][i] = temp;
    		  }
    	  }
      }
      static void solve2(int a[][]) {
    	  for(int i = 0; i < a.length; i++) {
    		  for(int j = 0; j < a.length / 2; j++) {
    			  int temp = a[i][j]; a[i][j] = a[i][a.length - j -1]; a[i][a.length - j - 1] = temp;	
    		  }
    	  }
      }
      static void rot(int a[][]) {
    	  solve1(a);
    	  solve2(a);
      }
      static boolean solve(int a[][]) {
    	  for(int i = 0; i < a.length; i++) {
    		  for(int j = 0; j < a.length; j++) {
    			  if(i > 0 && a[i][j] <= a[i - 1][j]) return false;
    			  if(j > 0 && a[i][j] <= a[i][j-1]) return false;
     		  }
    	  }
    	  return true;
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
