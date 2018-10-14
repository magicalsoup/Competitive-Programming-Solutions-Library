import java.util.*;
public class JaydenStudiesTrees {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static int n , len = 0, farthest = 0;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i <= n; i++)
			adj.add(new ArrayList<Edge>());
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj.get(a).add(new Edge(b));
			adj.get(b).add(new Edge(a));
		}
		bfs(1); bfs(farthest);
		System.out.println(len);
		sc.close();
	}
	static void bfs(int i) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean v[] = new boolean[n + 1];
		int dist[] = new int[n + 1];
		v[i] = true;
		len = 0;
		farthest = 0;
		queue.add(i);
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			if(dist[curr] > len) {
				len = dist[curr];
				farthest = curr;
			}
			for(Edge e : adj.get(curr)) {
				if(!v[e.dest]) {
					v[e.dest] = true;
					dist[e.dest] = dist[curr] + 1;
					queue.add(e.dest);
				}
			}
		}
	}
	static class Edge{
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
}
