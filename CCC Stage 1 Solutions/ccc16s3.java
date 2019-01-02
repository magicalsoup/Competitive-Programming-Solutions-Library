import java.util.*;
public class ccc16s3{
	static int dis[], n, p, l, rt, cnt = 0;
	static boolean pho[];
	static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>(), g2 = new ArrayList<ArrayList<Integer>>();
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); p = sc.nextInt(); dis = new int[n + 1]; pho = new boolean[n + 1];
		for(int i = 0; i <= n;i ++) {g.add(new ArrayList<Integer>()); g2.add(new ArrayList<Integer>());}
		for(int i = 0; i < p; i++) {
			rt = sc.nextInt(); pho[rt] = true;
		}
		for(int i = 1; i < n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			g.get(x).add(y); g.get(y).add(x);
		}
		tree_prunning(rt, -1);
		Arrays.fill(dis, 0); l = 0;
		dfs(rt, - 1);
		System.out.println(2 * cnt - l); sc.close();
	}
	static void tree_prunning(int u, int par) {
		if(par != -1) dis[u] = dis[par] + 1;
		if(dis[u] > l && pho[u]) {l = dis[u]; rt = u;}
		for(int v : g.get(u)) {
			if(v == par) continue;
			tree_prunning(v, u);
			if(!g2.get(v).isEmpty() || pho[v]) { g2.get(u).add(v); g2.get(v).add(u); cnt++;}
		}
	}
	static void dfs(int u, int par) {
		if(par != -1) { dis[u] = dis[par] + 1; l = Math.max(l, dis[u]);}
		for(int v : g2.get(u)) {
			if(v == par) continue;
			dfs(v, u);
		}
	}
}
