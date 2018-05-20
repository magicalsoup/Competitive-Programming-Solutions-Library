import java.util.*;
public class graph2p2 {
static boolean[]vis,rec;
static boolean[][]graph;
static int N;
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	N=  sc.nextInt();
	graph = new boolean[N+1][N+1];
	vis = new boolean[N+1];
	rec = new boolean[N+1];
	for(int i=1;i<=N;i++) {
		for(int j=1;j<=N;j++) {
			int p = sc.nextInt();
			if(p==1)
				graph[i][j] = true;
		}
	}
	for(int i=1;i<=N;i++) {
		if(cyclic(i)) {
			System.out.println("NO");
			return;
		}
	}
	System.out.println("YES");
	return;
}
public static boolean cyclic(int n) {
	if(!vis[n]) {
		vis[n] = true;
		rec[n] = true;
		for(int i=1;i<=N;i++) {
			if(graph[i][n]) {
				if(!vis[i]&&cyclic(i))
					return true;
				else if(rec[i])
					return true;
			}
		}
	}
	rec[n] = false;
	return false;
}
}
