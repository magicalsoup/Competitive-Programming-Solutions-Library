import java.util.*;
public class BFS {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static boolean v[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		v = new boolean[n];
		init(n);
		for(int i=0;i<n;i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			adj.get(a).add(new Edge(b));
		}
		bfs(1);
		sc.close();
	}
	static void bfs(int i) {
		v[i] = true;
		queue.add(i);
		while(!queue.isEmpty()) {
			i = queue.poll();
			System.out.println(i);
			for(Edge e: adj.get(i)) {
				if(!v[e.dest]) {
					v[e.dest] = true;
					queue.add(e.dest);
				}
			}
		}
	}
	static void init(int n) {
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<Edge>());
	}
	static class Edge{
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
}
