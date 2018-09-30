import java.util.*;
import java.io.*;
public class TudorAndThePusheens {
	static int x, y;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static boolean v[];
	static int d[];
	public static void main(String[]args) throws IOException{ 
		 int n = readInt();
		 int m = readInt();
		 v = new boolean[n + 1];
		 d = new int[n + 1];
		 for(int i = 0; i <=n; i++)
			 adj.add(new ArrayList<Edge>());
		 
		 for(int i = 0; i < m; i++) {
			 int a = readInt();
			 int b = readInt();
			 adj.get(a).add(new Edge(b));
			 adj.get(b).add(new Edge(a));
		 }
		 int s = readInt();
		 int t = readInt();
		 bfs(s);
		 System.out.println(m - d[t]);
	}
	static class Edge {
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
	static void bfs(int i) {
		queue.add(i);
		d[i] = 0;
		v[i] = true;
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(Edge e: adj.get(curr)) {
				if(!v[e.dest]) {
					v[e.dest] = true;
					d[e.dest] = d[curr] + 1;
					queue.add(e.dest);
				}
			}
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
	
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
