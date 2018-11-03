import java.util.*;
import java.io.*;
public class SurpriseTeleport {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	static LinkedList<Node> queue = new LinkedList<Node>();
	static int[] movex = { -1, 1, 0, 0 }, movey = { 0, 0, -1, 1};
	static char[][] grid;
	static int [][] dist;
	static Node []pos;
	static int r, c;
	public static void main(String[]args) throws IOException{
		r = readInt(); c = readInt(); int max = -1;
		grid = new char[r][c]; dist = new int[r][c];
		Node start = new Node(readInt(), readInt()), end  = new Node(readInt(), readInt());
		for(int i = 0; i < dist.length; i++) { Arrays.fill(dist[i], 0x3f3f3f3f); }
		for(int i = 0; i < r; i++) grid[i] = next().toCharArray();
		int t = readInt(); pos = new Node[t];
		for(int i = 0; i < t; i++) { pos[i] = new Node(readInt(), readInt());}
		bfs(start);
		for(int i = 0; i < t; i++) { max = Math.max(max, dist[end.x][end.y] - dist[pos[i].x][pos[i].y]); }
		System.out.println(max);
	}
	static void bfs(Node start){
		dist[start.x][start.y] = 0;
		queue.add(start);
		while(!queue.isEmpty()) {
			start = queue.poll();
			for(int i = 0; i < 4; i++){
				int nx = movex[i] + start.x, ny = movey[i] + start.y;
				if(nx < 0 || nx >= r || ny < 0 || ny >= c || grid[nx][ny] == 'X' || dist[nx][ny] <= dist[start.x][start.y] + 1) continue;
				dist[nx][ny] = dist[start.x][start.y] + 1;
				queue.add(new Node(nx, ny));
			}
		}
	}
	static class Node{
		int x, y;
		public Node(int x, int y) { this.x = x; this.y = y; }
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
