import java.util.*;
import java.io.*;
   public class PathToWaterloo{
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
     static StringTokenizer st;
     static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
     static boolean vis[];
     static int dis[], ans = 0;
     public static void main(String[]args) throws IOException{
    	 int n = readInt(), m = readInt(); HashMap<String, Integer> mp = new HashMap<String, Integer>();
    	 for(int i = 1; i <= n; i++) mp.put(readLine(), i); mp.put("home", 0); mp.put("Waterloo GO", n + 1);
    	 for(int i = 0; i <= n + 1; i++) adj.add(new ArrayList<Integer>()); vis = new boolean[n + 2]; dis = new int[n + 2];
    	 for(int i = 0; i < m; i++) {
    		 String s[] = readLine().split("-");
    		 int u = mp.get(s[0]), v = mp.get(s[1]);
    		 adj.get(u).add(v); adj.get(v).add(u);
    	 }
    	 if(bfs(0, n + 1)) pw.println(ans);
    	 else pw.println("RIP ACE"); pw.close();
     }
     static boolean bfs(int src, int dest) {
    	 LinkedList<Integer> q = new LinkedList<Integer>();
    	 q.add(src); vis[src] = true;
    	 while(!q.isEmpty()) {
    		 int cur = q.poll();
    		 for(int v : adj.get(cur)) {
    			 if(!vis[v]) {
    				 vis[v] = true;
    				 dis[v] = dis[cur] + 1;
    				 q.add(v);
    				 if(v == dest) {ans = dis[v]; return true;}
    			 }
    		 }
    	 }
    	 return false;
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
