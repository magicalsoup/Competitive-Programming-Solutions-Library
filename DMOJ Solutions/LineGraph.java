 import java.util.*;
 import java.io.*;
    public class LineGraph{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int[] p;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), k = readInt(), cnt = 0, mst = 0; Edge e[] = new Edge[3 * n]; p = new int[3 * n + 1]; int ptr = 0;
    	  for(int i = 0; i < e.length; i++) e[i] = new Edge(0, 0, 0x3f3f3f3f);
    	  for(int i = 0; i < p.length; i++) p[i] = i;
    	  for(int i = 0; i < n - 1; i++) {e[ptr++] = new Edge(i, i + 1, readInt());}
    	  for(int i = 0; i < n; i++) {
    		  if(i - k > 0) e[ptr++] = new Edge(i, i - k, 0);
    		  if(i + k < n) e[ptr++] = new Edge(i, i + k, 0);
    	  }
    	  Arrays.sort(e);
    	  for(int i = 0; i < ptr; i++) {
    		  int u = e[i].u, v = e[i].v, w = e[i].w;
    		  if(cnt == n - 1) break;
    		  int fu = Find(u), fv = Find(v);
    		  if(fu != fv) { p[fu] = fv; cnt++; mst += w;}
    	  }
    	  pw.println(mst); pw.close();
      }
      static int Find(int d) { 
    	  if(d != p[d]) p[d] = Find(p[d]); return p[d];
      }
      static class Edge implements Comparable<Edge>{
    	  int u, v, w; public Edge(int u, int v, int w) {this.u = u; this.v = v; this.w = w;}
    	  public int compareTo(Edge x) { return Integer.compare(w,  x.w);}
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
