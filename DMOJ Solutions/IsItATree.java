import java.util.*;
public class IsItATree {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static ArrayList<Integer>ans = new ArrayList<Integer>();
	static boolean v[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);	
		for(int i = 0; i < 4; i++)
			adj.add(new ArrayList<Edge>());
		v = new boolean[4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++ ) {
				int x = sc.nextInt();
				if(x == 1)
					adj.get(i).add(new Edge(j));
			}
		}
		sc.close();
		if(solve())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static boolean solve(int i ,int parent) {
		v[i] = true;
		for(Edge e: adj.get(i)) {
				if(!v[e.dest]) {
					if(solve(e.dest,i))
						return true;
				}
				else if( e.dest != parent)
					return true;
		}
		return false;
	}
	static boolean solve() {
		if(solve(0,-1))
			return false;
		for(int i = 0; i < 4; i++)
			if(!v[i])
				return false;
		return true;
	}
	static class Edge {
		int dest;
		public Edge(int dest) {
			this.dest = dest;
		}
	}
}

