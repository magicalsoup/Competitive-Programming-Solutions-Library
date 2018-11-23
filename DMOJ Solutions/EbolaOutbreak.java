import java.util.*;
import java.io.*;
    public class EbolaOutbreak{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); DUS tree = new DUS(n + 1); ArrayList<Integer> ans = new ArrayList<Integer>();
    	  for(int t =0 ; t < m; t++) {
    		  int k = readInt(), a = readInt();
    		  for(int i = 1; i < k; i++) {int b = readInt(); tree.union(a, b); a = b;}
    	  }
    	  for(int i = 1; i <= n; i++) if(tree.find(1) == tree.find(i)) ans.add(i);
    	  pw.println(ans.size()); for(int i : ans) pw.print(i + " "); pw.close();
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
      static class DUS{
  		int rank[];
  		int parent[];
  		int n;
  		public DUS(int n) {
  			rank = new int[n];
  			parent = new int[n];
  			this.n = n;
  			makeSet();
  		}
  		public void makeSet() {
  			for(int i = 0; i < n; i++)
  				parent[i] = i;
  		}
  		public int find(int x) {
  			if(parent[x] != x)
  				parent[x] = find(parent[x]);
  			return parent[x];
  		}
  		public void union(int x, int y) {
  			int xRoot = find(x);
  			int yRoot = find(y);
  			
  			if(xRoot == yRoot) return;
  			
  			if(rank[xRoot] < rank[yRoot]) parent[xRoot] = yRoot;
  			
  			else if(rank[yRoot] < rank[xRoot]) parent[yRoot] = xRoot;
  			
  			else {
  				parent[yRoot] = xRoot;
  				rank[xRoot]++;
  			}
  		}
  	}
  }
