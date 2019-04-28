import java.util.*;
import java.io.*;
public class cco15p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	public static void main(String []args) throws IOException {
		int n = readInt(), m = readInt();
		for(int i=0; i<n; i++)
			adj.add(new ArrayList<Edge>());
		
		for(int i=0; i<m ;i++) {
			int u = readInt(), v = readInt(), w = readInt();
			adj.get(u).add(new Edge(v, w));
		}
		
		int dp[][] = new int[n][1<<n];
		

		
		dp[0][1] = 0;
		LinkedList<Node> q = new LinkedList<Node>();
		
		q.add(new Node(0, 1));
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			for(Edge e : adj.get(cur.node)) {
				
				if((cur.mask & (1 << e.v)) == 0) {
					
					int newMask = cur.mask | (1 << e.v);
					
					if(dp[e.v][newMask] < dp[cur.node][cur.mask] + e.w) {
						
						dp[e.v][newMask] = dp[cur.node][cur.mask] + e.w;
						
						q.add(new Node(e.v, newMask));
					}
					
				}
			}
		}
		
		long ans = 0;
		for(int i = 1; i < (1<<n); i++)
			ans = Math.max(ans, dp[n-1][i]);
		
		
		System.out.println(ans);

	}
	static class Edge {
		int v, w;
		public Edge(int v, int w) {
			this.v = v;
			this.w = w;	
		}
	}
	static class Node {
		int node, mask;
		public Node(int node, int mask) {
			this.node = node;
			this.mask = mask;
		}
	}
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}
