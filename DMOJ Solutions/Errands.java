import java.io.*;
import java.util.*;
public class Errands{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    static int dist[];
    static boolean v[];
    static LinkedList<Integer> q = new LinkedList<Integer>();
    public static void main(String[]args) throws IOException{
    	int n = readInt(), m = readInt(), q = readInt(), c = readInt(); dist = new int[n + 1]; v = new boolean[n + 1];
    	for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>()); Arrays.fill(dist, 0x3f3f3f3f);
    	for(int i = 0; i < m; i++){ int u = readInt(), v = readInt(); adj.get(u).add(v); adj.get(v).add(u); }
    	bfs(c);
    	for(int i = 0; i < q; i++){
    		int a = readInt(), b = readInt();
    		if(dist[a] == 0x3f3f3f3f || dist[b] == 0x3f3f3f3f) pw.println("This is a scam!");
    		else pw.println(dist[a] + dist[b]);
    	} 
    	pw.close();
    }
    static void bfs(int src){
    	v[src] = true; q.add(src); dist[src] = 0;
    	while(!q.isEmpty()){
    		int cur = q.poll();
    		for(Integer e : adj.get(cur)){
    			if(!v[e]){v[e] = true; dist[e] = dist[cur] + 1; q.add(e);}
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
