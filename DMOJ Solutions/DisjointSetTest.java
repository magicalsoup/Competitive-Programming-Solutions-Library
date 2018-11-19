 import java.util.*;
 import java.io.*;
    public class DisjointSetTest{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int[] p;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); ArrayList<Integer> ans = new ArrayList<Integer>(); p = new int[n]; 
    	  Arrays.fill(p, -1);for(int i = 1; i <= m; i++) if(union(readInt() - 1, readInt() - 1)) ans.add(i);
    	  if(ans.size() == n - 1) for(int i : ans) pw.println(i);
    	  else pw.println("Disconnected Graph"); pw.close();
      }
      static int Find(int d) { 
    	  if(p[d] < 0) return d;
    	  return p[d] = Find(p[d]); 
      }
      static boolean union(int v, int w) {
    	   v = Find(v);
    	   w = Find(w);
    	   if(v == w) return false;
    	   if(p[v] > p[w]) {int tmp = v; v = w; w = tmp;}
    	   p[v] += p[w]; p[w] = v;
    	   return true;
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
