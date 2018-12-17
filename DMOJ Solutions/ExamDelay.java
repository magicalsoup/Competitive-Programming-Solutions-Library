import java.util.*;
import java.io.*;
public class ExamDelay{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;	
      static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
      public static void main(String[]args) throws IOException{
    	  int V = readInt(), E = readInt(); for(int i = 0; i <= V; i++) adj.add(new ArrayList<Edge>());
    	  for(int i = 0; i < E; i++) {
    		  int m = readInt(), n = readInt(), d = readInt(), s = readInt();
    		  adj.get(m).add(new Edge(n, d, s)); adj.get(n).add(new Edge(m, d, s));
    	  }
		  PriorityQueue<Node> q = new PriorityQueue<Node>(); 
		  double dis[] = new double[V + 1]; int cnt[] = new int[V + 1]; Arrays.fill(dis, 0x3f3f3f3f);
		  dis[1] = 0; q.add(new Node(1, 0));
		  while(!q.isEmpty()) {
			  Node u = q.poll();
			  for(Edge e : adj.get(u.dest)) {
				  double cur = dis[u.dest] + e.dist / e.speed;
				  if(cur < dis[e.dest] || (cur == dis[e.dest] && cnt[u.dest] + 1 <= cnt[e.dest])) { 
					  dis[e.dest] = cur; cnt[e.dest] = cnt[u.dest] + 1; q.add(new Node(e.dest, dis[e.dest]));
				  }
			  }
		  }
		  pw.println(cnt[V]); pw.println(Math.round(60 * (dis[V] / 0.75 - dis[V]))); pw.close();
      }	
      
      static class Edge{
    	  int dest; double dist, speed; public Edge(int dest, double dist, double speed) {this.dest = dest; this.dist = dist; this.speed = speed;}
      } 
      static class Node implements Comparable<Node>{
    	  int dest; double weight; public Node(int dest, double weight) {this.dest = dest; this.weight = weight;}
    	  public int compareTo(Node o) { return Double.compare(weight, o.weight);}
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
