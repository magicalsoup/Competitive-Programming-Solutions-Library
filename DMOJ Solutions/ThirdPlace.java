import java.util.*;
import java.io.*;
public class ThirdPlace {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	static ArrayList<ArrayList<pair>> adj = new ArrayList<ArrayList<pair>>();
	static int dist[];
	static boolean vis[];
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	public static void main(String[]args) throws IOException{
		int n = readInt();
		int longest = -1;
		long ans = -1;
		int node = 0;
		int prevNode = 0;
		vis = new boolean[n + 1];
		dist = new int[n + 1];
		for(int i = 0; i < n; i++)
			adj.add(new ArrayList<pair>());
		
		for(int i = 1; i < n; i++) {
			int a = readInt() - 1;
			int b = readInt() - 1;
			int c = readInt();
			adj.get(a).add(new pair(b, c));
			adj.get(b).add(new pair(a, c));
		}
		bfs(0);
		for(int i = 0; i < n; i++) {
			if(dist[i] > longest) {
				longest = dist[i];
				node = i;	
			}
		}
		bfs(node);
		prevNode = node;
		longest = -1;
		for(int i = 0; i < n; i++) {
			if(dist[i] >= longest) {
				ans = longest;
				longest = dist[i];
				node = i;
			}
			else if(dist[i] >= ans) ans = dist[i];
		}
		bfs(node);
		for(int i = 0; i < n; i++) {
			if(dist[i] >= longest && (i ^ prevNode) != 0) {
				ans = longest;
				longest = dist[i];
			}
			else if(dist[i] >= ans && (i ^ prevNode) != 0) ans = dist[i];
		}
		pw.println(ans);
		pw.close();
	}
	static void bfs(int src) {
		Arrays.fill(dist, 0x3f3f3f3f);
		Arrays.fill(vis, false);
		vis[src] = true;
		dist[src] = 0;
		queue.add(src);
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(int i = 0; i < adj.get(curr).size(); i++) {
				pair next = adj.get(curr).get(i);
				if(!vis[next.first]) {
					vis[next.first] = true;
					dist[next.first] = dist[curr] + next.second;
					queue.push(next.first);
				}
			}
		}
	}
	static class pair{
		int first;
		int second;
		public pair(int first, int second) {
			this.first = first;
			this.second = second;
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
