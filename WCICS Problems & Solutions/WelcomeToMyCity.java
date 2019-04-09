import java.util.*;
import java.io.*;
public class WelcomeToMyCity {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(), a = readInt(), b = readInt(); ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
  		for(int i = 0; i <= n; i++) adj.add(new ArrayList<Edge>());
		int dis[] = new int[n + 1]; Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i = 1; i < n; i++) {int u = readInt(), v = readInt(), w = 1; adj.get(u).add(new Edge(v , w)); adj.get(v).add(new Edge(u, w));}
		PriorityQueue<Edge> q = new PriorityQueue<Edge>();
		dis[a] = 0; q.add(new Edge(a, 0));
		while(!q.isEmpty()) {
			Edge u = q.poll();
			if(u.w > dis[u.v]) continue;
			for(Edge e : adj.get(u.v)) {
				if(dis[e.v] > dis[u.v] + e.w) { dis[e.v] = dis[u.v] + e.w; q.add(new Edge(e.v, dis[e.v]));}
			}
		}
		System.out.println(dis[b]);
	}
	static class Edge implements Comparable<Edge>{
		int v, w;
		public Edge(int v, int w) {this.v = v; this.w = w;}
		public int compareTo(Edge e) { return w - e.w; }
	}
    static String next () throws IOException {
  	  while (st == null || !st.hasMoreTokens())
  		  st = new StringTokenizer(br.readLine().trim());
  	  return st.nextToken();
    }
    
    static long readLong () throws IOException {
  	  return Long.parseLong(next());
    }

    static int readInt () throws IOException {
  	  return Integer.parseInt(next());
    }

    static double readDouble () throws IOException {
  	  return Double.parseDouble(next());
    }
    
    static String readLine () throws IOException {
  	  return br.readLine().trim();
    } 
}
