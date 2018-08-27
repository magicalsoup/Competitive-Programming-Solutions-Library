import java.util.*;
import java.io.*;
public class sleigh {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static int total = 0;
	static int max = 0;
	static boolean[] v;
	public static void main(String[]args) throws Exception {
		int n = readInt();
		v = new boolean[n+1];
		for(int x=0;x<=n;x++)
			adj.add(new ArrayList<Edge>());
		for(int x=0;x<n;x++) {
			int a = readInt();
			int b = readInt();
			int cost = readInt();
			adj.get(a).add(new Edge(b,cost));
			adj.get(b).add(new Edge(a,cost));
		}
		dfs(0,0);
		System.out.println(total*2-max);
	}
	static void dfs(int i,int curr) {
		v[i] = true;
		boolean isleaf = true;
		for(Edge e:adj.get(i)) {
			if(!v[e.dest]) {
				if(!isleaf)
					total-=curr;
				dfs(e.dest,e.cost+curr);
				isleaf = false;
			}
		}
		if(isleaf) {
			total += curr;
			max = Math.max(max, curr);
		}
	}
	static class Edge{
		int dest,cost;
		public Edge(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
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
