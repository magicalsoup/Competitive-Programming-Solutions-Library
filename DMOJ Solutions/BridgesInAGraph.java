import java.util.*;
public class BridgesInAGraph{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 5; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edges = new int[m][2];
			for (int i = 0; i < m; i++) {
				edges[i][0] = sc.nextInt() - 1;
				edges[i][1] = sc.nextInt() - 1;
			}
	
			int bridges = 0;
			for (int[] excludedEdge : edges) {
				DisjointSet ds = new DisjointSet(n);
				for (int[] edge : edges) {
					if (edge != excludedEdge)
						ds.union(edge[0], edge[1]);
				}
	
				Node repr = ds.find(0);
				for (int i = 1; i < n; i++) {
					if (ds.find(i) != repr) {
						bridges++;
						break;
					}
				}
			}
			System.out.println(bridges);
		}
		sc.close();
	}
	static class DisjointSet {
		
		private Node[] nodes;
		
		
		public DisjointSet(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++)
				nodes[i] = new Node();
		}
		public Node find(int i) {
			Node node = nodes[i];
			if (node.parent == node)
				return node;
			else {
				Node temp = node;
				while (temp.parent != temp)
					temp = temp.parent;
				node.parent = temp;  
				return temp;
			}
		}
		public void union(int i, int j) {
			Node x = find(i);
			Node y = find(j);
			if (x == y)
				return;
			else if (x.rank < y.rank)
				x.parent = y;
			else if (x.rank > y.rank)
				y.parent = x;
			else {
				x.parent = y;
				y.rank++;
			}
		}
	}
	static class Node {
		
		public Node parent;
		public int rank;
		public Node() {
			parent = this;
			rank = 0;
		}
	}
}
