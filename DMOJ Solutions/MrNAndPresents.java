import java.util.*;
import java.io.*;
    public class MrNAndPresents{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  Map<Integer, Pair> mp = new HashMap<Integer, Pair>();
    	  int st = -1, ed = -1;
    	  int q = readInt();
    	  while(q-- > 0) {
    		  char c = next().charAt(0); int x = readInt();
    		  if(c == 'F') {
    			  if(st != -1) mp.put(st, new Pair(x, mp.get(st).second));
    			  mp.put(x, new Pair(-1, st)); st = x;
    			  if(ed == -1) ed = x;
    		  }
    		  if(c == 'E') {
    			  if(ed != - 1) mp.put(ed, new Pair(mp.get(ed).first, x));
    			  mp.put(x, new Pair(ed, -1)); ed = x;
    			  if(st == -1) st = x;
    		  }
    		  if(c == 'R') {
    			  Pair n = mp.get(x);
    			  if(n.first != -1) mp.get(n.first).second = n.second;
    			  if(n.second != -1) mp.get(n.second).first = n.first;
    			  if(st == x) st = n.second;
    			  if(ed == x) ed = n.first;
    			  if(st == -1) st = ed;
    			  if(ed == -1) ed = st;
    		  }
    	  }
    	  while(st != -1) {pw.println(st); st = mp.get(st).second;} pw.close();
      }
      static class Pair{
    	  int first, second;
    	  public Pair(int first, int second) {
    		  this.first = first;
    		  this.second = second;
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
