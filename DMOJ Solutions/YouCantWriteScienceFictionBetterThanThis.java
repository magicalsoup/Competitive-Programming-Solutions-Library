import java.util.*;
public class YouCantWriteScienceFictionBetterThanThis {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static boolean flag = false;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt() - 1, b = sc.nextInt() - 1;
		for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>()); int ans = 0;
		for(int i = 0; i < m; i++) { int x = sc.nextInt() - 1, y = sc.nextInt() - 1; adj.get(x).add(y); adj.get(y).add(x);}
		sc.close(); ans += bfs(0, a, n); 
		if(!flag) {System.out.println(-1); return;}
		flag = false; ans += bfs(a, b, n); 
		if(!flag) {System.out.println(-1); return;}
		System.out.println(ans); 
		
	}
	static int bfs(int start, int dest, int n) {
		LinkedList<Integer>queue = new LinkedList<Integer>(); boolean v[] = new boolean[n]; int dist[] = new int[n];
		v[start] = true; Arrays.fill(dist, 0x3f3f3f3f);dist[start] = 0; queue.add(start); 
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(int e : adj.get(cur)) {
				if(!v[e]) {dist[e] = dist[cur] + 1; v[e] = true; queue.add(e); if(e == dest) {flag = true; return dist[e];}}
			}
		}
		return 0;
	}
}
