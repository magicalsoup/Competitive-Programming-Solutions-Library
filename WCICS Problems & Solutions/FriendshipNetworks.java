import java.util.*;
public class FriendshipNetworks {
	static int parent[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Edge edges[] = new Edge[m]; parent = new int[n+1];
		for(int i = 0; i <= n; i++) parent[i] = i;
		
		long mst = 0, total = 0;
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
			edges[i] = new Edge(u, v, w);
			total += w;
		}
		Arrays.sort(edges); int cnt = 0;
		for(int i = 0; i < m; i++) {
			int u = edges[i].u, v = edges[i].v; long w = edges[i].w;
			if(cnt == n-1) break;
			int fu = find(u), fv = find(v);
			if(fu != fv) {
				parent[fu] = fv;
				mst += w;
				cnt++;
			}
		}
		System.out.println((total-mst));
		sc.close();
	}
	static int find(int d) {
		if(d != parent[d])
			parent[d] = find(parent[d]);
		return parent[d];
	}
	static class Edge implements Comparable<Edge>{
		int u, v; long w;
		public Edge(int u, int v, long w) {
			this.u = u; this.v = v; this.w = w;
		}
		@Override
		public int compareTo(Edge o) {
			return Long.compare(w, o.w);
		}
	}
}
