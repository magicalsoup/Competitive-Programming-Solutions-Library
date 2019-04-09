import java.util.*;
import java.io.*;
public class BudgetTourism {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(), m = readInt(), b = readInt();
		ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
		long dis[] = new long[n];
		
		for(int i = 0; i < n; i++) adj.add(new ArrayList<Edge>());
		
		for(int i = 0; i < m; i++) {
			int u = readInt(), v  = readInt(), w = readInt();
			adj.get(u).add(new Edge(v, w));
			adj.get(v).add(new Edge(u, w));
		}
	
		
		Arrays.fill(dis, 0x3f3f3f3f);
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dis[0] = 0;
		pq.add(new Edge(0, 0));
		while(!pq.isEmpty()) {
			Edge cur = pq.poll();
			if(cur.w > dis[cur.v]) continue;
			for(Edge e : adj.get(cur.v)) {
				if(dis[e.v] > dis[cur.v] + e.w) {
					dis[e.v] = dis[cur.v] + e.w;
					pq.add(new Edge(e.v, dis[e.v]));
				}
			}
		}
		System.out.println(dis[b]);
	}
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static class Edge implements Comparable<Edge>{
		int v; long w;
		public Edge(int v, long w) {
			this.v = v;
			this.w = w;
		}
		@Override
		public int compareTo(Edge o) {
			return Long.compare(o.w, w);
		}
	}
}
