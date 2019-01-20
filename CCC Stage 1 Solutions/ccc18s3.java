import java.util.*;
 import java.io.*;
    public class ccc18s3{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int d[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}, dis[][];
      static char g[][];
      static boolean vis[][];
      static PriorityQueue<Pair> q = new PriorityQueue<Pair>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); ArrayList<Point> cam = new ArrayList<Point>();
    	  g = new char[n + 1][m + 1]; vis = new boolean[n + 1][m + 1]; dis = new int[n + 1][m + 1]; Point st = new Point(1, 1);
    	  for(int i = 1; i <= n; i++) {
    		  String s = next();
    		  for(int j = 1; j <= m; j++) {
    			  g[i][j] = s.charAt(j - 1);
    			  if(g[i][j] == 'S') st = new Point(i, j);
    			  if(g[i][j] == 'C') cam.add(new Point(i, j));
    		  }
    	  }
    	  cameraBfs(cam); for(int i = 0; i < dis.length; i++) Arrays.fill(dis[i], 0x3f3f3f3f);
    	  dis[st.x][st.y] = 0; bfs(st.x, st.y);
    	  for(int i = 1; i <= n; i++) {
    		  for(int j = 1; j <= m; j++) {
    			  if(g[i][j] == '.') pw.println(dis[i][j] == 0x3f3f3f3f? -1: dis[i][j]);
    		  }
    	  }
    	  pw.close();
      }
      static void bfs(int stx, int sty) {
    	  if(!vis[stx][sty]) q.add(new Pair(0, stx, sty)); dis[stx][sty] = 0;
    	  while(!q.isEmpty()) {
    		  Pair p = q.poll(); int r = p.x, c = p.y;
    		  if(p.dist > dis[r][c]) continue;
    		  if(g[r][c] == '.' || g[r][c] == 'S') {
    			  for(int k = 0; k < 4; k++) {
    				  int nr = r + d[k][0], nc = c + d[k][1]; push(p.dist+ 1, nr, nc);
    			  }
    		  }
	        else if(g[r][c] == 'L') push(p.dist, r, c - 1);
	        else if(g[r][c] == 'R') push(p.dist, r, c + 1);
	        else if(g[r][c] == 'U') push(p.dist, r - 1, c);
	        else if(g[r][c] == 'D') push(p.dist, r + 1, c);
    	  }
      }
      static void cameraBfs(ArrayList<Point> cam) {
    	 for(Point p : cam) {
    		 int r = p.x, c = p.y; vis[r][c] = true;
    		 for(int k = 0; k < 4; k++)
    			 for(int t = 1 ;; t++) {
    				 int nr = r + t * d[k][0], nc = c + t * d[k][1];
    				 if(g[nr][nc] == 'W') break;
    				 if(g[nr][nc] == '.' || g[nr][nc] == 'S') vis[nr][nc] = true;
    			 }
    	 }
      }
      static void push(int dd, int r, int c) {
    	  if(g[r][c] != 'W' && !vis[r][c] && dis[r][c] > dd) {
    		  q.add(new Pair(dd, r, c)); dis[r][c] = dd;
    	  }
      }
      static class Point{
    	  int x, y; public Point(int x, int y) {this.x = x; this.y = y;}
      }
      static class Pair implements Comparable<Pair>{
    	  int dist, x, y;
    	  public Pair(int dist, int x, int y) {
    		  this.dist = dist;
    		  this.x = x;
    		  this.y = y;
    	  }
    	  public int compareTo(Pair o) {
    		  return dist - o.dist;
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
