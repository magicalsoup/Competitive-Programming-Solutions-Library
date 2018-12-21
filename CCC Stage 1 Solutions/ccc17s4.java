import java.util.*;
import java.io.*;
    public class Test{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int parent[], rank[];
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), d = readInt(); Edge edges[] = new Edge[m]; parent = new int[n * 2 + 1]; rank = new int[n * 2 + 1];
    	  for(int i = 0; i < m; i++) {
    		  if(i < n - 1)
    			  edges[i] = new Edge(readInt(), readInt(), readInt(), 0);
    		  else
    			  edges[i] = new Edge(readInt(), readInt(), readInt(), 1);
    	  }
     	  Arrays.sort(edges); init(); int cnt = 0, mst = 0, days = 0, i = 0;
    	  for(i = 0; i < m; i++) {
    		  if(cnt == n - 1) break;
    		  if(union(edges[i].u, edges[i].v)) {
    			  cnt++; 
    			  mst = edges[i].w;	
    			  days += edges[i].o;
    		  }
    	  }
    	  if(edges[i - 1].o == 1) {
    		  init();
    		  for(Edge e: edges) {
    			  if(find(e.u) != find(e.v)) {
    				  if(e.w < mst || (e.w == mst && e.o == 0)) merge(e.u, e.v);
    				  else if(e.o == 0 && e.w <= d) {
    					  pw.println(days - 1); pw.close();
    					  return;
    				  }
    			  }
    		  }
    	  }
    	  pw.println(days); pw.close();
      }
      static int find(int d) {
    	  	if(d != parent[d])
    	  		parent[d] = find(parent[d]);
    	  	return parent[d];
      }
      static void init() {
    	  for(int i = 1; i < parent.length; i++)
    		  parent[i] = i;
      }
      static boolean union(int x, int y) {
  		  int xRoot = find(x);
  		  int yRoot = find(y);
  			
  		  if(xRoot == yRoot) return false;
  			
  		  if(rank[xRoot] < rank[yRoot]) parent[xRoot] = yRoot;
  			
  		  else if(rank[yRoot] < rank[xRoot]) parent[yRoot] = xRoot;
  			
  		  else {
  				parent[yRoot] = xRoot;
  				rank[xRoot]++;
  		  }
  		  return true;
  	  }
      static void merge(int v, int w) {
  		  int xRoot = find(v);
  		  int yRoot = find(w);
  			
  		  if(xRoot == yRoot) return;
  			
  		  if(rank[xRoot] < rank[yRoot]) parent[xRoot] = yRoot;
  			
  		  else if(rank[yRoot] < rank[xRoot]) parent[yRoot] = xRoot;
  			
  		  else {
  				parent[yRoot] = xRoot;
  				rank[xRoot]++;
  		  }
      }
      static class Edge implements Comparable<Edge>{
    	  public int u, v, w, o; 
    	  public Edge(int u, int v, int w, int o) {this.u = u; this.v = v; this.w = w; this.o = o;}
    	  public int compareTo(Edge e) {
    		  if (e.w != w) return Integer.compare(w, e.w);
    		  return Integer.compare(o, e.o);
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
