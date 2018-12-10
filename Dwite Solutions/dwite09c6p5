import java.util.*;
import java.io.*;
public class dwite09c6p5{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static HashMap<String, Integer> mp;
      public static void main(String[]args) throws IOException{
    	  for(int testcases = 0; testcases < 5; testcases++) {
    		  int m = readInt(); ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>(); mp = new HashMap<String, Integer>();
    		  for(int i = 0; i < 2 * m + 1; i++) adj.add(new ArrayList<Edge>());
    		  for(int i = 0; i < m; i++) { 
    			  int a = getNodeId(next()), b = getNodeId(next()), weight = readInt(); adj.get(a).add(new Edge(b, weight));
    		  }
    		  PriorityQueue<Edge> pq = new PriorityQueue<Edge>(); int dist[] = new int[2 * m + 1]; Arrays.fill(dist, Integer.MAX_VALUE);
    		  int start = getNodeId("YYZ"), end = getNodeId("SEA"); dist[start] = 0; pq.add(new Edge(start, 0));
    		  while(!pq.isEmpty()) {
    				Edge u = pq.poll();
    				if(u.w > dist[u.v]) continue;
    				for(Edge e : adj.get(u.v)) {
    					if(dist[e.v] > dist[u.v] + e.w) { dist[e.v] = dist[u.v] + e.w; pq.add(new Edge(e.v, dist[e.v]));}
    				}
    			}
    		  pw.println(dist[end]); 
    	  } pw.close();
      }
      static int getNodeId(String name) {
    	  if(!mp.containsKey(name))
    		  mp.put(name, mp.size() + 1);
    	  return mp.get(name);
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
