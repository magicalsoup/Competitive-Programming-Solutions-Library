import java.util.*;
import java.io.*;
    public class DrHenriAndSeeingStars{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{	
    	  int r = readInt(), x = readInt(), y = readInt(); Star stars[] = new Star[3];
    	  for(int i = 0; i < 3; i++) stars[i] = new Star(readInt(), readInt(), readInt()); Arrays.sort(stars); 
    	  if(stars[0].dist(x, y, stars[0].x, stars[0].y) < r) pw.println("What a beauty!");
    	  else pw.println("Time to move my telescope!"); pw.close();
      }
      static class Star implements Comparable<Star>{
    	  int x, y, magnitude; public Star(int x, int y, int magnitude) {this.x = x; this.y = y; this.magnitude = magnitude;}
    	  public int compareTo(Star s) {return magnitude - s.magnitude;}
    	  public double dist(int x1, int y1, int x2, int y2) {return Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2));}
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
