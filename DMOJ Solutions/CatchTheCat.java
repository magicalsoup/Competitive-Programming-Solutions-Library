import java.util.*;
import java.io.*;
    public class CatchTheCat{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static boolean v[];
      static int dist[];
      static LinkedList<Integer> queue = new LinkedList<Integer>();
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), dest = readInt(); dist = new int[1000000]; v = new boolean[1000000]; 
    	  pw.println(bfs(n, dest)); pw.close();
      }
      static int bfs(int start, int dest) {
    	  v[start] = true; queue.add(start); dist[start] = 0;
    	  int min = 0x3f3f3f3f;
    	  while(!queue.isEmpty()) {
    		  int cur = queue.poll();
    		  int walk1 = cur + 1, walk2 = cur - 1, jump = cur * 2;
    		  if(jump < dist.length) { 
    			  if(!v[jump]) { v[jump] = true; dist[jump] = dist[cur] + 1; queue.add(jump);}
    			  if(jump == dest) min = Math.min(min, dist[jump]);	
    		  }
    		  if(walk1 < dist.length) {
    			  if(!v[walk1]) { v[walk1] = true; dist[walk1] = dist[cur] + 1; queue.add(walk1);}
    			  if(walk1 == dest) min = Math.min(min, dist[walk1]);
    		  }
    		  if(walk2 >= 0) {
    			  if(!v[walk2]) { v[walk2] = true; dist[walk2] = dist[cur] + 1; queue.add(walk2);}
    			  if(walk2 == dest) min = Math.min(min, dist[walk2]);
    		  }
    	  }
    	  return min;
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
