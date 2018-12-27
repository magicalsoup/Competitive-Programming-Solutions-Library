import java.util.*;
import java.io.*;
    public class nccc5j5s3{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); Edge e [] = new Edge[m];
    	  for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 0; i < m; i++) {
    		  int u = readInt(), v = readInt(); adj.get(u).add(v);
    		  e[i] = new Edge(u, v);
    	  }
    	 // for(Edge cur : e)
    		  //pw.println(cur.u + " " + cur.v);
    	  for(Edge cur : e) {
    		  adj.get(cur.u).remove(Integer.valueOf(cur.v));
    		  boolean vis[] = new boolean[n + 1];
    		  bfs(1, n, n, vis); 
    		  if(vis[n]) pw.println("YES");
    		  else pw.println("NO");
    		  adj.get(cur.u).add(cur.v);
    		  
    	  }
    	  pw.close();
      }
      
      static boolean bfs(int src, int dest, int n, boolean vis[]) {
    	  LinkedList<Integer> q = new LinkedList<Integer>();
    	  vis[src] = true; q.add(src);
    	  while(!q.isEmpty()) {
    		  int p = q.poll();
    		  for(int e : adj.get(p)) {
    			  //pw.println(e);
    			  if(!vis[e]) {
    				  vis[e] = true;
    				  q.add(e);
    				  if(e == dest) return true;
    			  }
    		  }
    	  }
    	  return false;
      }
      static class Edge{
    	  int u, v; public Edge(int u, int v) { this.u = u; this.v = v;}
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
