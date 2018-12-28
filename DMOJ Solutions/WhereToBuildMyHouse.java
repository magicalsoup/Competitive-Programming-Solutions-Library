import java.util.*;
import java.io.*;
public class WhereToBuildMyHouse{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int l = readInt(), n = readInt(); ArrayList<Pair> v = new ArrayList<Pair>();
    	  for(int i = 0; i < n; i++) v.add(new Pair(readInt(), readInt()));
    	  Collections.sort(v); int cur = 0, ans = 0;;
    	  for(Pair p : v) {
    		  if(p.f > cur) ans = Math.max(ans, p.f - cur);
    		  cur = Math.max(cur, p.s);
    	  }
    	  pw.println(Math.max(ans, l - cur)); pw.close();
      }
      static class Pair implements Comparable<Pair>{
    	  int f, s; public Pair(int f, int s) { this.f = f; this.s = s;}
    	  public int compareTo(Pair p) {return f - p.f;}
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
