import java.util.*;
public class AlienTravel {
	static ArrayList<Edge> adj = new ArrayList<Edge>();
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			adj.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		sc.close();
		
		int dist[] = new int[n];
		
		Arrays.fill(dist, 0x3f3f3f3f);
		dist[0] = 0;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int u = adj.get(j).u;
				int v = adj.get(j).v;
				int w = adj.get(j).w;
				
				if(dist[u] != 0x3f3f3f3f && dist[u] + w < dist[v])
					dist[v] = dist[u] + w;
			}
		}
		
		for(int i = 0; i < m; i++) {
			int u = adj.get(i).u, v = adj.get(i).v, w = adj.get(i).w;
			if(dist[u] != 0x3f3f3f3f && dist[u] + w < dist[v]) {
				System.out.println("Beginning of time");
				return;
			}
		}
		
		System.out.println(dist[n-1] == 0x3f3f3f3f? "inf": dist[n-1]);
	}
	static class Edge{
		int u, v, w;
		public Edge(int u, int v, int w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}
	}
}
