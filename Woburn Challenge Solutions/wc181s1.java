import java.util.*;
 import java.io.*;
    public class wc181s1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int r = readInt(), c = readInt(), k = readInt(); int g[][] = new int[r][c];
    	  for(int i = 0; i < r; i++)
    		  for(int j = 0; j < c; j++)
    			  g[i][j] = readInt();
    	  out.println(solve(g, r, c, k)); out.close();
      }
      static int solve(int g[][], int r, int c, int k) {
    	  int students = 0;
    	  for(int i = 0; i < c; i++) {
			  int p = Integer.MIN_VALUE;
    		  for(int j = 0; j < r; j++) {
    			  if(g[j][i] == 1) {p = j;} 
    			  else if(g[j][i] == 2 && p >= j - k) students++;
    		  }
    	  }
    	  return students;
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
