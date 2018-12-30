import java.util.*;
import java.io.*;
public class Dijkstras_PriorityQueue {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	static Vertex arr[];
	public static void main(String[]args) throws IOException{
	}
    static void dijkstras(int start) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		arr[start].distance = 0;
		pq.add(new Pair(start, 0));
		while(!pq.isEmpty()){
			Pair a = pq.poll();
			for(Pair i : arr[a.dest].adj) {
				if(arr[i.dest].distance > a.weight + i.weight){
					pq.add(new Pair(i.dest, a.weight + i.weight));
					arr[i.dest].distance = a.weight + i.weight;
				}
			}
		 }
	  }
    static class Vertex{
    	int index;
    	long distance;
    	Set<Pair> adj;
    	public Vertex(int i) {
    		index = i;
    		distance = Long.MAX_VALUE;
    		adj = new HashSet<>();
    	}
    }
    static class Pair implements Comparable<Pair>{
    	int dest; long weight;
    	public Pair(int dest, long weight) {
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
