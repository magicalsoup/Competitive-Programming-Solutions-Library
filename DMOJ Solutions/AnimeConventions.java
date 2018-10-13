import java.util.*;
public class AnimeConventions {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		DUS tree = new DUS(n);
		while(q-- > 0) {
			char com = sc.next().charAt(0);
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(com == 'A')
				tree.union(a, b);
			if(com == 'Q') {
				if(tree.find(a) == tree.find(b))
					System.out.println("Y");
				else
					System.out.println("N");
			}
		}
		sc.close();
	}
	static class DUS{
		int rank[];
		int parent[];
		int n;
		public DUS(int n) {
			rank = new int[n];
			parent = new int[n];
			this.n = n;
			makeSet();
		}
		public void makeSet() {
			for(int i = 0; i < n; i++)
				parent[i] = i;
		}
		public int find(int x) {
			if(parent[x] != x)
				parent[x] = find(parent[x]);
			return parent[x];
		}
		public void union(int x, int y) {
			int xRoot = find(x);
			int yRoot = find(y);
			
			if(xRoot == yRoot) return;
			
			if(rank[xRoot] < rank[yRoot]) parent[xRoot] = yRoot;
			
			else if(rank[yRoot] < rank[xRoot]) parent[yRoot] = xRoot;
			
			else {
				parent[yRoot] = xRoot;
				rank[xRoot]++;
			}
		}
	}
}
