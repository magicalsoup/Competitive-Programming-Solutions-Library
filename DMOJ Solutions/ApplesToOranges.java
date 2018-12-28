import java.util.*;
import java.io.*;
public class ApplesToOranges{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static Map<String, Integer> mp = new HashMap<String, Integer>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); Edge edges[] = new Edge[m]; 
    	  for(int i = 0; i < n; i++) mp.put(next(), i);
    	  for(int i = 0; i < m; i++) {int u = getNodeId(next()), v = getNodeId(next()); double c = readDouble(); edges[i] = new Edge(u, v, c);}
    	  double shop[] = new double[n];
    	  int st = getNodeId("APPLES"); shop[st] = 1;
    	  bfs(edges, shop, n); double prev = shop[st]; bfs(edges, shop, n);
    	  if(shop[st] - prev > 0.1) pw.println("YA");
    	  else pw.println("NAW"); pw.close();
      }
      static void bfs(Edge edges[], double shop[], int n) {
    	  for(int i = 0; i < n; i++)
    		  for(Edge e : edges) 
    			  shop[e.dest] = Math.max(shop[e.dest], shop[e.src] * e.weight);
      }
      static class Edge{
    	  int src, dest; double weight;
    	  public Edge(int src, int dest, double weight) {
    		  this.src = src;
    		  this.dest = dest;
    		  this.weight = weight;
    	  }
      }
      static int getNodeId(String s) {
    	  if(!mp.containsKey(s)) mp.put(s, mp.size());
    	  return mp.get(s);
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
