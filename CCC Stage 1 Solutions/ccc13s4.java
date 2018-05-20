import java.util.*;
import java.io.*;
public class ccc13s4{
	static int n,m;
	static ArrayList<Integer>[]adj;
public static void main(String[]args)throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(in.readLine());
	 n = Integer.parseInt(st.nextToken());
	 m = Integer.parseInt(st.nextToken());
	 adj = new ArrayList[n+1];
	 for(int i=1;i<=n;i++) {
		 adj[i] = new ArrayList<Integer>();
	 }
	 for(int i=0;i<m;i++) {
		 st = new StringTokenizer(in.readLine());
		 int x  = Integer.parseInt(st.nextToken());
		 int y = Integer.parseInt(st.nextToken());
		 adj[x].add(y);
	 }
	 st = new StringTokenizer(in.readLine());
	 int p = Integer.parseInt(st.nextToken());
	 int q = Integer.parseInt(st.nextToken());
	 if(BFS(p,q)) {
		 System.out.println("yes");
	 }
	 else if(BFS(q,p)) {
		 System.out.println("no");
	 }
	 else {
		 System.out.println("unknown");
	 }
}
public static boolean BFS(int st,int des) {
	boolean[]vis = new boolean[n+1];
	Queue<Integer> q = new 	LinkedList<Integer>();
	q.add(st);
	vis[st] = true;
	while(!q.isEmpty()) {
		int cur = q.poll();
		for(int v:adj[cur]) {
			if(!vis[v]) {
				q.add(v);
				vis[v] = true;
			}
		}
		if(vis[des]) {
			return true;
		}
	}
	return false;
}
}