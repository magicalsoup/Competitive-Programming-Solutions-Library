import java.util.*;
import java.io.*;
    public class LeftoverEggnog{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static LinkedList<Edge> queue = new LinkedList<Edge>();
      static boolean v[][], found = false;;
      static int A, B, dest;
      public static void main(String[]args) throws IOException{
    	 A = readInt(); B = readInt(); dest = readInt(); v = new boolean[dest + A][dest + B];
    	 bfs(0, 0); if(!found) pw.println("Not possible"); pw.close();
      }
      static void bfs(int startX, int startY) {
    	  queue.add(new Edge(0, 0, ""));
    	  while(!queue.isEmpty()) {
    		  Edge s = queue.poll();
    		  if(s.a == dest || s.b == dest) { pw.println(s.edge); found = true; break;}
    		  if(v[s.a][s.b]) continue; v[s.a][s.b] = true;
    		  queue.add(new Edge(A, s.b, s.edge + "fill A\n"));
    		  queue.add(new Edge(s.a, B, s.edge + "fill B\n"));
    		  if(s.a >= B - s.b) queue.add(new Edge(s.a - (B - s.b), B, s.edge + "pour A B\n"));
    		  else queue.add(new Edge(0, s.b + s.a, s.edge + "pour A B\n"));
    		  if(s.b >= A - s.a) queue.add(new Edge(A, s.b - (A - s.a),s.edge + "pour B A\n"));
    		  else queue.add(new Edge(s.a + s.b, 0, s.edge + "pour B A\n"));
    		  queue.add(new Edge(0, s.b, s.edge + "chug A\n"));
    		  queue.add(new Edge(s.a, 0, s.edge + "chug B\n"));
    	  }
      }
      static class Edge{
    	  int a, b;
    	  String edge;
    	  public Edge(int a, int b, String edge) { this.a = a; this.b = b; this.edge = edge;}
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
