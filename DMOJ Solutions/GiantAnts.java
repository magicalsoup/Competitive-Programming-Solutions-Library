 import java.util.*;
 import java.io.*;
    public class GiantAnts{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      static LinkedList<Integer> queue = new LinkedList<Integer>();
      static int dist[], dist2[];
      static boolean[] vis;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); dist = new int[n]; dist2 = new int[n]; vis = new boolean[n];
    	  for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 0; i < m; i++) {int a = readInt() - 1, b = readInt() - 1; adj.get(a).add(b); adj.get(b).add(a);}
    	  int w = readInt();
    	  for(int i = 0; i < w; i++) {int u = readInt() - 1; queue.add(u); vis[u] = true;}
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  for(int v : adj.get(cur)) { if(!vis[v]) { dist2[v] = dist2[cur] + 4; vis[v] = true; queue.add(v);}}
    	  }
    	  Arrays.fill(vis, false); queue.add(0); vis[0] = true; boolean cannotReach = true; int min = 0;
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  for(int v : adj.get(cur)) {
    			  if(!vis[v]) { 
    				  if(dist[cur] + 1 >= dist2[v]) {continue;}
    				  dist[v] = dist[cur] + 1; vis[v] = true; queue.add(v);
    				  if(v == n - 1) {min = dist[v]; cannotReach = false; break;}
    			  }
    		  }
    	  }
    	  if(cannotReach) pw.println("sacrifice bobhob314");
    	  else pw.println(min); pw.close();
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
