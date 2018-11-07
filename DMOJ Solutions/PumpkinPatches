import java.util.*;
import java.io.*;
    public class PumpkinPatches{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int p = readInt();
    	  ArrayList<Point> list = new ArrayList<Point>();
    	  while(p-->0) {
    		  list.add(new Point(readInt(), readInt()));
    	  }
    	  int xmax = Integer.MIN_VALUE;
    	  int ymax = Integer.MIN_VALUE;
    	  int xmin = Integer.MAX_VALUE;
    	  int ymin = Integer.MAX_VALUE;
    	  for(int i = 0 ; i < list.size(); i++) {
    		  xmax = Math.max(xmax, list.get(i).x);
    		  ymax = Math.max(ymax, list.get(i).y);
    		  xmin = Math.min(xmin, list.get(i).x);
    		  ymin = Math.min(ymin, list.get(i).y);
    	  }
    	  System.out.println((Math.abs(xmax - ymin) + Math.abs(xmin - ymax)) * 2);
    	  out.close();
      }
      static class Point{
    	  int x;
    	  int y;
    	  public Point(int x, int y) {
    		  this.x = x;
    		  this.y = y;
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
