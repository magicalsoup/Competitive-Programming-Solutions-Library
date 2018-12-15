import java.util.*;
import java.io.*;
public class TroublingTriangles{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt();
    	  while(n -- > 0) {
    		  Point a = new Point(readInt(), readInt()), b = new Point(readInt(), readInt()), c = new Point(readInt(), readInt());
    		  double l1 = a.distFrom(b), l2 = b.distFrom(c), l3 = c.distFrom(a);
    		  double peri = perimeter(l1, l2, l3), area = area(l1, l2, l3);
    		  pw.println(area + " "+ peri);
    	  }
    	  pw.close();
      }	
      static double area(double a, double b, double c) {
    	  double s = (a + b + c) / 2, a1 = s - a, b1 = s - b, c1 = s - c; return Math.sqrt(s * a1 * b1 * c1);
      }
      static double perimeter(double a, double b, double c) {
    	  return a + b + c;
      }
      static class Point{
    	  double x, y; public Point(double x, double y) {this.x = x; this.y = y;}
    	  public double distFrom(Point o) {return Math.sqrt( Math.abs(x - o.x) * Math.abs(x - o.x) + Math.abs(y - o.y) * Math.abs(y - o.y));}
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
