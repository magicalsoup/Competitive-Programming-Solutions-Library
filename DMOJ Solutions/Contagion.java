import java.util.*;
import java.io.*;
public class Contagion{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); long dis[] = new long[n]; ArrayList<Point> adj = new ArrayList<Point>(); boolean vis[] = new boolean[n];
    	  for(int i = 0; i < n; i++) adj.add(new Point(readInt(), readInt())); Arrays.fill(dis, Long.MAX_VALUE);
    	  int x = readInt() - 1; dis[x] = 0;
    	  for(int i = 0; i < n - 1; i++) {
    		  int id = -1;
   			  long min = Long.MAX_VALUE;
    		  for(int j = 0; j < n; j++) if(!vis[j] && dis[j] < min) {min = dis[j]; id = j;}
			  if(id == -1) break; vis[id] = true;
			  for(int j = 0; j < n; j++)
				  if(dis[id] + dist(adj.get(id), adj.get(j)) < dis[j])
					  dis[j] = dis[id] + dist(adj.get(id), adj.get(j));
    	  }
    	  Arrays.sort(dis); int q = readInt();
	      for(int i = 0; i < q; i++) {
	    	  long c = readLong();
	    	  int left = 0, right = n;
	    	  while(left < right) {
	    		  int mid = (right + left) / 2;
	    		  if(dis[mid] > c) right = mid;
	    		  else left = mid + 1;
	    	  }
	    	  pw.println(left);
    	  }
	      pw.close();
      }
      static long dist(Point a, Point b) {
    	  return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
      }
      static class Point{
    	  long x, y; public Point(long x, long y) {this.x = x; this.y = y;}
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
