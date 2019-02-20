import java.util.Scanner;
public class DisjointSet {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		DUS tree = new DUS(10);
		System.out.println(tree.n);
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
  		public int find(int x) { // path compression
  			if(parent[x] != x)
  				parent[x] = find(parent[x]);
  			return parent[x];
  		}
  		public void union(int x, int y) { // rank compression
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
