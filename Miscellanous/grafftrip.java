import java.util.*;
import java.io.*;
public class grafftrip {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	@SuppressWarnings("unchecked")
	public static void main(String[]args)throws IOException{
		int n = readInt();
		int m = readInt();
		int start = readInt()-1;
		int end	 = readInt()-1;
		long time = readLong();
		LinkedList<Edge>[]edges = new LinkedList[n];
		for(int i=0;i<n;i++) {
			edges[i] = new LinkedList<Edge>();
		}
		while(m-->0) {
			int a = readInt();
			int b = readInt();
			int w=  readInt();
			edges[--a].add(new Edge(--b,w));
		}
		int shrine = readInt();
		int []interest = new int[shrine+2];
		interest[0] = start;
		interest[shrine+1] = end;
		for(int i=1;i<=shrine;i++) {
			interest[i] = readInt()-1;
		}
		long[][] grid = new long[interest.length][interest.length];
		for(int i=0;i<interest.length;i++) {
			long[] dist = new long[n];
			Arrays.fill(dist, 1L<<60);
			dist[interest[i]] = 0;
			PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
			q.add(new Vertex(interest[i],0));
			while(!q.isEmpty()) {
				Vertex curr = q.poll();
				if(curr.w!=dist[curr.v]) continue;
				for(Edge out:edges[curr.v]) {
					if(dist[out.d] >curr.w+out.w) {
						dist[out.d] = curr.w+out.w;
						q.add(new Vertex(out.d,dist[out.d]));
					}
				}
			}
			for(int j=0;j<interest.length;j++) {
				grid[i][j] = dist[interest[j]];
			}
		}
		if(grid[0][grid.length-1]>time) {
			out.println(-1);
			out.close();
		}
		else {
			long min = 1;
			long max = time;
			while(min!=max) {
				long mid = (min+max)/2;
				long[] dist = new long[interest.length];
				Arrays.fill(dist, 1L<<60);
				PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
				dist[0] = 0;
				q.add(new Vertex(0,0));
				while(!q.isEmpty()) {
					Vertex curr = q.poll();
					if(dist[curr.v]!=curr.w)continue;
					for(int k=0;k<dist.length;k++) {
						if(grid[curr.v][k]<=mid&&dist[k]>curr.w+grid[curr.v][k]) {
							dist[k] = curr.w+grid[curr.v][k];
							q.add(new Vertex(k,dist[k]));
						}
					}
				}
				if(dist[dist.length-1]<=time) {
					max = mid;
				}
				else {
					min = mid+1;
				}
			}
			out.println(min);
		}
		out.close();
		System.exit(0);
	}
	static class Vertex implements Comparable<Vertex>{
		public int v;
		public long w;
		public Vertex(int a,long b) {
			v = a;
			w = b;
		}
		public int compareTo(Vertex curr) {
			if(w<curr.w) return -1;
			if(w>curr.w) return 1;
			return 0;
		}
	}
	static class Edge{
		public int d,w;
		public Edge(int a,int b) {
			d = a;
			w = b;
		}
	}
	static String next () throws IOException {
	while (st == null || !st.hasMoreTokens())
		st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
}
