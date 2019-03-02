import java.util.*;
 import java.io.*;
    public class TicTacToe{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt();
    	  while(n-- > 0) {
    		  char[][] g = new char[3][3]; boolean naught = false, cross = false; int O = 0, X = 0;
    		  String s = next(); String a = s.substring(0, 3), b = s.substring(3, 6), c = s.substring(6); 
    		  g[0] = a.toCharArray(); g[1] = b.toCharArray(); g[2] = c.toCharArray();
    		  //printGrid(g);
    		  naught = find(g, 'O'); cross = find(g, 'X'); O = count(g, 'O'); X = count(g, 'X');
    		  //System.out.println(naught + " " + cross + " " + O + " " + X);
    		  if(solve(naught, cross, O, X)) System.out.println("yes");
    		  else System.out.println("no");
    	  } pw.close();
      }
      static boolean solve(boolean naught, boolean cross, int O, int X) {
    	  if(cross && X == O) return false;
    	  if(naught && O != X) return false;
    	  if(O > X) return false;
    	  if(Math.abs(X - O) > 1) return false;
    	  if(naught && cross) return false;
    	  return true;
      }
      static int count(char g[][], char mark) {
    	  int cnt = 0;
    	  for(int i = 0; i < 3; i++) 
    		  for(int j = 0; j < 3; j++)
    			  if(g[i][j] == mark) cnt++;
    	  return cnt;
      }
      static boolean find(char g[][], char mark) {
    	  if(g[0][0] == g[0][1] && g[0][1] == g[0][2] && g[0][2] == mark) return true;
    	  if(g[1][0] == g[1][1] && g[1][1] == g[1][2] && g[1][2] == mark) return true;
    	  if(g[2][0] == g[2][1] && g[2][1] == g[2][2] && g[2][2] == mark) return true;
    	  
    	  if(g[0][0] == g[1][0] && g[1][0] == g[2][0] && g[2][0] == mark) return true;
    	  if(g[0][1] == g[1][1] && g[1][1] == g[2][1] && g[2][1] == mark) return true;
    	  if(g[0][2] == g[1][2] && g[1][2] == g[2][2] && g[2][2] == mark) return true;
    	  
    	  if(g[0][0] == g[1][1] && g[1][1] == g[2][2] && g[2][2] == mark) return true;
    	  if(g[0][2] == g[1][1] && g[1][1] == g[2][0] && g[2][0] == mark) return true;
    	  return false;
    	  
    	  
      }
      static void printGrid(char g[][]) {
		  for(int i = 0 ; i < 3; i++) {
			  for(int j = 0; j < 3; j++)
				  System.out.print(g[i][j] + " ");
			  System.out.println();
		  }
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
