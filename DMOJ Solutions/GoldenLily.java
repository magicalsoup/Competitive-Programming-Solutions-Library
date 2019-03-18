import java.util.*;
import java.io.*;

public class GoldenLily {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int movex[] = {0, 1, -1};
	static int movey[] = {1, 0, 0};
	public static void main(String[] args) throws IOException{
		int l = readInt(), d = readInt(), grid[][] = new int[d][l];
		for (int i = 0; i < d; i++) 
			for (int j = 0; j < l; j++) 
				grid[i][j] = readInt();
			
		
		int gl = readInt(), gd = readInt();
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		int dp[][] = new int[d][l];
		for(int i = 0; i < d; i++) 
			for(int j = 0; j < l; j++) 
				dp[i][j] = 0x3f3f3f3f;
		
		dp[0][0] = grid[0][0];
		queue.offer(new Node(0, 0, grid[0][0]));
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			for(int i = 0; i < 3; i++) {
				int currx = curr.x + movex[i];
				int curry = curr.y + movey[i];
				if(currx >= 0 && curry >= 0 && currx < l && curry < d && dp[curry][currx] > curr.w + grid[curry][currx]) {
					dp[curry][currx] = curr.w + grid[curry][currx];	
					
					queue.offer(new Node(currx, curry, dp[curry][currx]));
				}
		
			}
		
		}
		System.out.println(dp[gd][gl]);
	}
	static class Node implements Comparable<Node>{
		int x;
		int y;
		int w;
		public Node(int x, int y, int w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}
		public int compareTo(Node o) {
			return Integer.compare(w, o.w);
		}
	}
	static String next() throws IOException {
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
	
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
