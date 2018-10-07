import java.util.*;
public class CanShahirEvenGetThere {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static boolean v[];
	static int a,b;
	public static void main(String[]args) {
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		for(int i = 0; i <= n; i++)
			adj.add(new ArrayList<Edge>());
		v = new boolean[n + 1];
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			adj.get(x).add(new Edge(y));
			adj.get(y).add(new Edge(x));
		}
		sc.close();
		if(a==b) {
			System.out.println("GO SHAHIR!");
			return;
		}
		bfs(a);
		System.out.println("NO SHAHIR!");
	}
	static void bfs(int i) {
		v[i] = true;
		queue.add(i);
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(Edge e : adj.get(curr)) {
				if(e.dest == b) {
					System.out.println("GO SHAHIR!");
					System.exit(0);
				}
				if(!v[e.dest]) {
					v[e.dest] = true;
					queue.add(e.dest);
				}
			}
		}
	}
	static void dfs(int i) {
		if(v[i])
			return;
		v[i] = true;
		for(Edge e : adj.get(i)) {
			if(e.dest == b) {
				System.out.println("GO SHAHIR!");
				System.exit(0);
			}
			if(!v[e.dest])
				dfs(e.dest);
		}
	}
	static class Edge{
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
}
