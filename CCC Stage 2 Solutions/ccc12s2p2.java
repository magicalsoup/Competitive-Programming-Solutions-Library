import java.util.*;
import java.io.*;
    public class ccc12s2p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
      static ArrayList<ArrayList<Edge>> adj2 = new ArrayList<ArrayList<Edge>>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); 
    	  for(int i = 0; i <= n; i++) adj.add(new ArrayList<Edge>());
    	  for(int i = 0; i <= n; i++) adj2.add(new ArrayList<Edge>());
    	  for(int i = 0; i < m; i++) {
    		  int a = readInt(), b = readInt(), c = readInt();
    		  adj.get(a).add(new Edge(b, c));
    		  adj2.get(b).add(new Edge(a, c));
    	  }
    	  int dis1[] = new int[n + 1]; int dis2[] = new int[n + 1];
    	  dijkstra(1, dis1, adj); dijkstra(n, dis2, adj2); int ans = 0x3f3f3f3f;
    	  int t = dis1[n];
    	  for(int i = 1; i <= n; i++) {
    		  for(Edge e : adj.get(i)) {
    			  int dist = dis1[i] + e.weight + dis2[e.dest];
    			  if(dist > t) ans = Math.min(ans, dist);
    		  }
    	  }
    	  if(ans == 0x3f3f3f3f) pw.println(-1);
    	  else pw.println(ans); pw.close();
      }	
      static void dijkstra(int st, int dis[], ArrayList<ArrayList<Edge>> adj) {
    	  PriorityQueue<Edge> q=  new PriorityQueue<Edge>(); Arrays.fill(dis, 0x3f3f3f3f);
    	  dis[st] = 0; q.add(new Edge(st, 0));
    	  while(!q.isEmpty()) {
    		  Edge u = q.poll();
    		  if(u.weight > dis[u.dest]) continue;
    		  for(Edge e : adj.get(u.dest)) {
    			  if(dis[e.dest] > dis[u.dest] + e.weight) {dis[e.dest] = dis[u.dest] + e.weight; q.add(new Edge(e.dest, dis[e.dest]));}
    		  }
    	  }
      }
      static class Edge implements Comparable<Edge>{
    	  int dest, weight; public Edge(int dest, int weight) {this.dest = dest; this.weight = weight;}
    	  public int compareTo(Edge e) {
    		  return weight - e.weight;
    	  }
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
