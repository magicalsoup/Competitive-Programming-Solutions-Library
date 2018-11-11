import java.util.*;
import java.io.*;
    public class SafeSquare{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int r = readInt(), c = readInt(); char grid[][] = new char[r][c];
    	  for(int i = 0; i < r; i++) grid[i] = next().toCharArray(); int ans = 0;
    	  for(int i = 0; i < r; i++) {
    		  for(int j = 0; j < c; j++) {
    			  if(grid[i][j] == '.') {
    				  int snake = 0, noSnake = 0;
    				  for(int k = -1; k < 2; k++) {
    					  for(int l = -1; l < 2; l++) {
    						  if(i + k >= 0 && i + k < r && j + l >= 0 && j + l < c && (k != 0 || l != 0)) { 
    							  if(grid[i + k][j + l] == '.') noSnake++; else snake++;
    						  }
    					  }
    				  }	
    				  if(noSnake > snake) ans++;
    			  }
    		  }
    	  }
    	  pw.println(ans); pw.close();
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
