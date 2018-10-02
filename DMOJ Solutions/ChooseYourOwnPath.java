import java.util.*;
public class ChooseYourOwnPath {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static int dist[];
	static boolean v[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		v = new boolean[n+1];
		dist = new int[n+1];
		Arrays.fill(dist, 1000000);
		ArrayList<Integer> endpages = new ArrayList<Integer>();
		for(int i = 0; i <= n ; i++)
			adj.add(new ArrayList<Edge>());
		for(int i = 1; i <=n; i++) {
			int m = sc.nextInt();
			if(m == 0) 
				endpages.add(i);
			for(int j = 1; j <= m; j++) {
				int a = sc.nextInt();
				adj.get(i).add(new Edge(a));
			}
		}
		bfs(1);
		boolean reachable = true;
		int shortest = Integer.MAX_VALUE;
		//for(Boolean t : v)
			//System.out.print(t+  " ");
		for(int i = 1; i <= n; i++)
			reachable &= v[i];
		
		System.out.println(reachable? "Y" : "N");
		for(int i = 0; i < endpages.size(); i++) 
			shortest = Math.min(shortest, dist[endpages.get(i)] + 1);
		
		System.out.println(shortest);
		sc.close();
	}
	static void bfs(int i) {
	v[i]  = true;
	queue.add(i);
	dist[i] = 0;
	while(!queue.isEmpty()) {
		int curr = queue.poll();
			for(Edge e : adj.get(curr)) {
				if(!v[e.dest]) {
					v[e.dest] = true;
					dist[e.dest] = dist[curr] + 1;
					queue.add(e.dest);
				}
			}
		}
	}
	static class Edge {
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
}
