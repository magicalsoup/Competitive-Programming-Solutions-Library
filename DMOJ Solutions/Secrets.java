import java.util.*;
import java.io.*;
    public class Secrets{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  Point agent1 = new Point(readInt(), readInt());
    	  Point agent2 = new Point(readInt(), readInt());
    	  Point shady = new Point(readInt(), readInt());
    	  int d = readInt();
    	  if(agent1.dist(shady) <= d || agent2.dist(shady) <= d) pw.println("Yes");
    	  else pw.println("No"); pw.close();
      }
      static class Point{
    	  int x, y;
    	  public Point(int x, int y) {this.x = x; this.y = y;}
    	  public double dist(Point o) {
    		  double x2 = Math.abs(x - o.x); double y2 = Math.abs(y - o.y);
    		  return Math.sqrt(x2 * x2 + y2 * y2);
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
