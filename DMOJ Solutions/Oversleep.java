import java.util.*;
import java.io.*;
public class Oversleep{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static char[][] g;
      static boolean[][] v;
      static int[] movex = {-1, 1, 0 , 0}, movey = {0, 0, -1, 1}, dist[];
      static LinkedList<Pair> q = new LinkedList<Pair>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), startx = 0, starty = 0; 
    	  g = new char[n][m]; v = new boolean[n][m]; dist = new int[n][m];
    	  for(int i = 0; i < n; i++) {
    		  String s = next();
    		  for(int j = 0; j < m; j++) {
    			  char c = s.charAt(j);
    			  if(c == 's') {startx = i; starty = j;}
    			  g[i][j] = c;
    		  }
    	  }
    	  pw.println(bfs(startx, starty, n, m)); pw.close();
      }
      static int bfs(int startx, int starty, int r, int c) {
    	  v[startx][starty] = true;
    	  q.add(new Pair(startx, starty));
    	  while(!q.isEmpty()) {
    		  Pair p = q.poll();
    		  for(int i = 0; i < 4; i++) {
    			  int nx = movex[i] + p.x, ny = movey[i] + p.y;
    			  if(nx < 0 || ny < 0 || nx >= r || ny >= c || v[nx][ny] || g[nx][ny] == 'X' ) continue;
    			  dist[nx][ny] = dist[p.x][p.y] + 1;
    			  if(g[nx][ny] == 'e') return dist[nx][ny] - 1;
    			  v[nx][ny] = true; q.add(new Pair(nx, ny));
    		  }
    	  }
    	  return -1;
      }
      static class Pair{
    	  int x, y; public Pair(int x, int y) {this.x = x; this.y = y;}
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
