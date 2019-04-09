import java.util.*;
public class PipingProblems {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static boolean vis[];
	static int dis[];
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
		vis = new boolean[n]; dis = new int[n];
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			adj.get(u).add(v);
		}
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(bfs(a, b)? ans : -1);
		sc.close();
	}
	static boolean bfs(int u, int v) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		vis[u] = true;
		q.add(u);
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int e : adj.get(cur)) {
				if(!vis[e]) {
					vis[e] = true;
					dis[e] = dis[cur] + 1;
					q.add(e);
					if(e == v) {
						ans = dis[e]; return true;
					}
				}
			}
		}
		return false;
	}
}
