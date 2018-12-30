import java.util.*;
public class Dijkstras_N_Squared { //single shortest path
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt(), m = sc.nextInt(), adj[][] = new int[n+1][n+1]; //adjaceny matrix
		for(int i = 0; i <= n; i++)Arrays.fill(adj[i], Integer.MAX_VALUE);
		for(int i = 1; i <= m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			adj[u][v] = Math.min(adj[u][v], w);
			adj[v][u] = Math.min(adj[v][u], w);
		}
		int dis[] = new int[n+1]; boolean vis[] = new boolean[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[1] = 0;
		for(int i = 1; i <= n; i++) {
			int min = Integer.MAX_VALUE;
			int u = -1;
			for(int j = 1; j <= n; j++){
				if(!vis[j]&&dis[j]<min) {
					min = dis[j];
					u = j;
				}
			}
			if(u==-1)break;
			vis[u]=true;
			for(int j = 1; j <= n; j++)
				if(adj[u][j]!=Integer.MAX_VALUE&&!vis[j])dis[j] = Math.min(dis[j], dis[u]+adj[u][j]);
		}
		for(int i = 1; i <= n; i++)
			System.out.println(vis[i]? dis[i]:-1);
	}
}
