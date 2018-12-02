 import java.util.*;
 import java.io.*;
    public class FaxThanksgivingDish{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw= new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static ArrayList<ArrayList<Integer>> recipes = new ArrayList<ArrayList<Integer>>();
      static int q[];
      static boolean vis[];
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(); 
    	  for(int i = 0; i <= n; i++) recipes.add(new ArrayList<Integer>());
    	  q = new int[n + 1]; vis = new boolean[n + 1];
    	  while(m-- > 0) {
    		  int w = readInt(); int k = readInt(); 
    		  while(k-- > 0) recipes.get(w).add(readInt());
    	  }
    	  for(int i = 1; i <= n; i++) q[i] = readInt();
    	  pw.println(solve(1)); pw.close();
      }
      static int solve(int x) {	
    	  vis[x] = true;
    	  if(recipes.get(x).size() == 0) return q[x];
    	  int min = Integer.MAX_VALUE;
    	  for(int k : recipes.get(x)) {
    		  if(vis[k]) min = 0;
    		  else min = Math.min(min, solve(k));
    	  }
    	  return q[x] + min;
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
