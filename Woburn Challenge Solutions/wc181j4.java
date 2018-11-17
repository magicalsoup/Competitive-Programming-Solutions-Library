import java.util.*;
import java.io.*;
    public class wc181j4{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); 
    	  for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());
    	  for(int i = 1; i < n; i++) { adj.get(i).add(0); adj.get(i).add(i + 1); adj.get(i + 1).add(i);}
    	  adj.get(n).add(0); for(int i = 1; i <= n; i++) adj.get(0).add(i);
    	  int prev = 0, steps = 0;
    	  while(m-- > 0) {
    		  int end = readInt(); 
    		  steps += bfs(prev, end, n);
    		  prev = end;
    	  }
    	  pw.println(steps + 1); pw.close();
      }
      static int bfs(int start, int end, int n) {
    	  LinkedList<Integer> q = new LinkedList<Integer>(); boolean v[] = new boolean[n + 1]; 
    	  int dist[] = new int[n + 1]; Arrays.fill(dist, 101); Arrays.fill(v, false);
    	  v[start] = true; dist[start] = 0; q.add(start);
    	  while(!q.isEmpty()) {
    		  int u = q.poll();
    		  for(int i : adj.get(u)) {
    			  if(!v[i]) { v[i] = true; dist[i] = dist[u] + 1; q.add(i); if(i == end) return dist[end];}
    		  }
    	  }
    	  return 0;
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
