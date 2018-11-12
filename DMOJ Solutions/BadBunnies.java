import java.util.*;
import java.io.*;
    public class BadBunnies{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      static LinkedList<Integer> queue = new LinkedList<Integer>();
      static int[] dist, pre; 
      static boolean[] vis;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), r = readInt(); pre = new int[n]; dist = new int[n]; vis = new boolean[n];
    	  for(int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 0; i < n - 1; i++) { int a = readInt() - 1, b = readInt() - 1; adj.get(a).add(b); adj.get(b).add(a);}
    	  for(int i = 0; i < r; i++) {int u = readInt() - 1; queue.add(u); vis[u] = true;}
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  for(int v : adj.get(cur)) { if(!vis[v]) { dist[v] = dist[cur] + 1; vis[v] = true; queue.add(v);}}
    	  }
    	  Arrays.fill(vis, false); int x = readInt() - 1, y = readInt() - 1;
    	  queue.add(x); vis[x] = true; pre[x] = 1;
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  for(int v : adj.get(cur)) { if(!vis[v]) { pre[v] = cur; vis[v] = true; queue.add(v);}}
    	  }
    	  int ans = Integer.MAX_VALUE;
    	  for(int i = y; i != 1; i = pre[i]) ans = Math.min(ans, dist[i]);
    	  pw.println(ans); pw.close();
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
