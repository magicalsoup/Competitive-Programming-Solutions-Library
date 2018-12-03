import java.util.*;
import java.io.*;
public class SingleSourceShortestPath {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Vertex[] arr;
	public static void main(String[] args) throws IOException{
		int n = readInt(), m = readInt(); arr = new Vertex[n + 1];
		for(int i = 1; i <= n; i++) arr[i] = new Vertex(i);
		while(m-->0) {
			int a = readInt();
			int b = readInt();
			int c = readInt();
			arr[a].adj.add(new Pair(b, c));
			arr[b].adj.add(new Pair(a, c));
		}
		dijkstras(n); pw.close();
	}
	static void dijkstras(int n) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		arr[1].distance = 0;
		pq.add(new Pair(1, 0));
		while(!pq.isEmpty()){
			Pair a = pq.poll();
			for(Pair i : arr[a.first].adj) {
				if(arr[i.first].distance>a.second+i.second){
					pq.add(new Pair(i.first, a.second + i.second));
					arr[i.first].distance=a.second+i.second;
				}
			}
		}
		for(int i = 1; i <= n; i++) pw.println(arr[i].distance == Integer.MAX_VALUE? -1 : arr[i].distance);
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
    static class Vertex{
    	int index;
    	int distance;
    	Set<Pair> adj;
    	public Vertex(int i) {
    		index = i;
    		distance = Integer.MAX_VALUE;
    		adj = new HashSet<>();
    	}
    }
    static class Pair implements Comparable<Pair>{
    	int first, second;
    	public Pair(int first, int second) {
    		this.first = first;
    		this.second = second;
    	}
    	public int compareTo(Pair a){
    		return Long.compare(second,a.second);
    	}
    }
}
