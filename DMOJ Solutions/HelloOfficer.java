import java.util.*;
import java.io.*;
    public class HelloOfficer{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static Vertex[] arr;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), b = readInt(), q = readInt(); arr = new Vertex[n + 1];
    	  for(int i = 0; i <= n; i++) arr[i] = new Vertex(i);
    	  for(int i = 0; i < m; i++) {int u = readInt(), v = readInt(), w = readInt(); arr[u].adj.add(new Pair(v, w)); arr[v].adj.add(new Pair(u, w));}
    	  dijkstras(b);
    	  for(int i = 0; i < q; i++) {
    		  int a = readInt();
    		  if(arr[a].distance == Integer.MAX_VALUE) pw.println(-1);
    		  else pw.println(arr[a].distance);
    	  }
    	  pw.close();
      }
      static void dijkstras(int start) {
  		PriorityQueue<Pair> pq = new PriorityQueue<>();
  		arr[start].distance = 0;
  		pq.add(new Pair(start, 0));
  		while(!pq.isEmpty()){
  			Pair a = pq.poll();
  			for(Pair i : arr[a.first].adj) {
  				if(arr[i.first].distance > a.second + i.second){
  					pq.add(new Pair(i.first, a.second + i.second));
  					arr[i.first].distance = a.second + i.second;
  				}
  			}
  		 }
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
