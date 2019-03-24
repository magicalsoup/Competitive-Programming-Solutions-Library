import java.util.*;
public class WishUponAStar {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(); DUS tree = new DUS(n);
		int c = 0;
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			if(!tree.connected(u, v)) tree.merge(u, v);
			else c++;
		}
		System.out.println(c > 1? "NO":"YES");
		sc.close();
	}
	static class DUS{
		int rank[];
		int parent[];
		int n;
		public DUS(int n) {
			this.rank = new int[n + 1];
			this.parent = new int[n + 1];
			this.n = n;
			makeset();
		}
		public void makeset() {
			for(int i = 0; i <= n; i++) 
				parent[i] = i;
		}
		public int find(int d) {
			if(parent[d] != d)
				return parent[d] = find(parent[d]);
			return parent[d];
		}
		public boolean connected(int x, int y) {
			return find(x) == find(y);
		}
		public void merge(int x, int y) {
			x = find(x); y = find(y);
			if(x == y) return;
			if(rank[x] < rank[y]) parent[x] = y;
			else if(rank[y] < rank[x]) parent[y] = x;
			else {
				parent[y] = x;
				rank[x]++;
			}
		}
	}
}
