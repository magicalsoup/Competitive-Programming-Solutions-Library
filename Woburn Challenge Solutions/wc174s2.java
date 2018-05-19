import java.util.*;
import java.io.*;
public class wc174s2 {
	@SuppressWarnings("unchecked")
	public static void main(String[]args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
StringTokenizer st = new StringTokenizer(br.readLine());
int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
ArrayList<Edge>[] adj = new ArrayList[n+1];
ArrayDeque<Edge>q = new ArrayDeque<Edge>();
int[][]dist = new int [2][n+1];
Arrays.fill(dist[0], Integer.MAX_VALUE);
Arrays.fill(dist[1],Integer.MAX_VALUE);
for(int i=1;i<=n;i++)
	adj[i] = new ArrayList<Edge>();
for(int i=0;i<m;i++) {
	st = new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken()),b = Integer.parseInt(st.nextToken());
	adj[a].add(new Edge(b,0,0));
	adj[b].add(new Edge(a,1,0));
}
int k =Integer.parseInt(br.readLine());
st = new StringTokenizer(br.readLine());
q.add(new Edge(1,0,Integer.MAX_VALUE));
int ans =0;
while(!q.isEmpty()) {
	Edge e = q.poll();
	if(e.dis<=dist[e.w][e.v]) {
		dist[e.w][e.v] = e.dis;
		for(Edge nxt:adj[e.v])
			if(e.v!=1) {
				if(nxt.w==e.w&&dist[nxt.w][nxt.v]>=e.dis+1)
					q.add(new Edge(nxt.v,nxt.w,e.dis+1));
			}
			else if(dist[nxt.w][nxt.v]>=e.dis+1)
				q.add(new Edge(nxt.v,nxt.w,1));
	}
}
for(int i=0;i<k;i++) {
	int x = Integer.parseInt(st.nextToken());
	if(ans>=0&&dist[0][x]<100000&&dist[1][x]<100000)
		ans+=dist[0][x]+dist[1][x];
	else
		ans = -1;
}
out.println(ans);
out.close();
	}
public static class Edge{
	int v,w,dis;
	public Edge(int v0,int w0,int dis0) {
		v =v0;
		w = w0;
		dis = dis0;
	}
}
}
