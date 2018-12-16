import java.util.*;
import java.io.*;
public class ThanksGivingFeast{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;	
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      static boolean vis[];
      static int dist1[], dist2[];
      static int s[];
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), k = readInt(), a = readInt(), b = readInt(); 
    	  dist1 = new int[n + 1]; dist2 = new int[n + 1]; vis = new boolean[n + 1]; s = new int[k];
    	  Arrays.fill(dist1, 0x3f3f3f3f); Arrays.fill(dist2, 0x3f3f3f3f);
    	  for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 0; i < k; i++) s[i] = readInt();
    	  for(int i = 0; i < m; i++) {
    		  int u = readInt(), v = readInt(); adj.get(u).add(v); adj.get(v).add(u);
    	  }
    	  bfs(a, b, dist1); Arrays.fill(vis, false); bfs(b, a, dist2);
    	  int min = Integer.MAX_VALUE;
    	  for(int i = 0; i < k; i++) {
    		  min = Math.min(min, dist1[s[i]] + dist2[s[i]]);
    	  }
    	  pw.println(min); pw.close();
      }	
      static void bfs(int src, int dest, int dist[]) {
    	  dist[src] = 0; vis[src] = true; LinkedList<Integer> q = new LinkedList<Integer>(); q.add(src);
    	  while(!q.isEmpty()) {
    		  int cur = q.poll();
    		  for(int x : adj.get(cur)) {
    			  if(!vis[x]) {
    				  vis[x] = true;
    				  dist[x] = dist[cur] + 1;
    				  q.add(x);
    			  }
    		  }
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
