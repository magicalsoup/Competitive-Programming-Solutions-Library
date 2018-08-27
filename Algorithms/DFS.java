import java.util.*;
public class DFS {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static boolean v[];
	static int total = 0;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		v = new boolean[n];
		init(n);
		for(int i=0;i<n;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			adj.get(a).add(new Edge(b, c));
			adj.get(b).add(new Edge(a, c));
		}
		dfs(0);
		System.out.println(total);
		sc.close();
	}
	static void init(int n) {
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Edge>());
		}
	}
	static void dfs(int i) {
		v[i] = true;
		for(Edge e: adj.get(i)) {
			if(!v[e.dest]) {
				total+=e.cost;
				dfs(e.dest);
			}
		}
	}
	static class Edge{
		int dest;
		int cost;
		public Edge(int dest,int cost) {
			this.dest = dest;
			this.cost = cost;
		}
	}
}
