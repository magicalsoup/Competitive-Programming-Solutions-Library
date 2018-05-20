import java.util.*;
import java.io.*;

public class ccc15s4{

	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;
	
	public static void main (String[] args) throws IOException {
         br = new BufferedReader(new InputStreamReader(System.in));
         out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int k = readInt();
		int n = readInt();
		int m = readInt();
		ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
		for (int x = 0; x < n; x++) adj.add(new ArrayList<Edge>());
		for (int x = 0; x < m; x++) {
			int a = readInt() - 1;
			int b = readInt() - 1;
			int t = readInt();
			int h = readInt();
			adj.get(a).add(new Edge(b, t, h));
			adj.get(b).add(new Edge(a, t, h));
		}
		int A = readInt() - 1;
		int B = readInt() - 1;
		int[][] min = new int[2001][201];
		for (int x = 0; x <= 2000; x++)
			for (int y = 0; y <= 200; y++)
				min[x][y] = 1 << 30;
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
		pq.offer(new Vertex(A, 0, 0));
		while (!pq.isEmpty()) {
			Vertex curr = pq.poll();
			for (Edge e : adj.get(curr.index)) {
				int nextH = curr.hull + e.h;
				int nextT = curr.cost + e.t;
				if (nextH >= k || min[e.dest][nextH] <= nextT) continue;
				min[e.dest][nextH] = nextT;
				pq.offer(new Vertex(e.dest, nextT, nextH));
			}
		}
		int minV = 1 << 30;
		for (int x = 0; x <= k; x++) minV = Math.min(minV, min[B][x]);
		if (minV == 1 << 30) System.out.println(-1);
		else System.out.println(minV);
	}
  
	static class Vertex implements Comparable<Vertex> {
		int index, hull;
		int cost;
    
		Vertex(int index, int cost, int hull) {
			this.index = index;
			this.cost = cost;
			this.hull = hull;
		}
    
		@Override
		public int compareTo(Vertex o) {
			return cost - o.cost;
		}
	}
  
	static class Edge{
		int dest;
		int t;
		int h;
    
		Edge(int dest, int t, int h){
			this.dest = dest;
			this.t = t;
			this.h = h;
		}
	}
  
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}