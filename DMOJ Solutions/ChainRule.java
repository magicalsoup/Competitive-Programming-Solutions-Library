import java.io.*;
import java.util.*;
public class ChainRule{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();
    static ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
    static int dist1[], dist2[];
    public static void main(String[]args) throws IOException{
    	int n = readInt(), m = readInt(); dist1 = new int[n + 1]; dist2 = new int[n + 1];
    	for(int i = 0; i <= n; i++) adj.add(new ArrayList<Pair>());
    	for(int i = 0; i < m; i++) {
    		int a = readInt(), b = readInt(), w = readInt();
    		adj.get(a).add(new Pair(b, w)); adj.get(b).add(new Pair(a, w));
    	}
    	Arrays.fill(dist1, 0x3f3f3f); Arrays.fill(dist2, 0x3f3f3f);
    	dijkstras(dist1, 0); dijkstras(dist2, n - 1); int max = 0; 
    	for(int i = 1; i < n - 1; i++) max = Math.max(max, dist1[i] + dist2[i]);
    	pw.println(max); pw.close();
    }
    static void dijkstras(int dist[], int start) {
		dist[start] = 0;
		pq.add(new Pair(start, 0));
		while(!pq.isEmpty()){
			int cur = pq.poll().dest;
			for(Pair i : adj.get(cur)) {
				if(dist[i.dest] > dist[cur] + i.weight){
					dist[i.dest] = dist[cur] + i.weight;
					pq.add(new Pair(i.dest, dist[i.dest]));
				}
			}
		 }
	 }
    static class Pair implements Comparable<Pair>{
    	int dest; int weight;
    	public Pair(int dest, int weight) {
    		this.dest = dest;
    		this.weight = weight;
    	}
    	public int compareTo(Pair a){
    		return Long.compare(weight, a.weight);
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
