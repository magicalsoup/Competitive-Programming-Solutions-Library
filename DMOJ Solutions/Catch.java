import java.util.*;
import java.io.*;
    public class Catch{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  Point a = new Point(readInt(), readInt());
    	  Point b = new Point(readInt(), readInt());
    	  Point c = new Point(readInt(), readInt());
    	  pw.println(Math.min(dist(a, b), Math.min(dist(b, c), dist(c , a)))); pw.close();
      } 
      public static int dist(Point o, Point o2) { 
    	  return (o.x - o2.x) * (o.x - o2.x) + (o.y - o2.y) * (o.y - o2.y);
      }
      static class Point{
    	  int x, y; public Point(int x, int y) {this.x = x; this.y = y;}
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
