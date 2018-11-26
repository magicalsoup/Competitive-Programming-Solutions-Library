import java.util.*;
import java.io.*;
    public class Melanioana{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  boolean bool = next().equals("trees!"); double max = 0, minus = 0, sum = 0;
    	  for(int i = 0; i < 4; i++) {
    		  double lo = readDouble(), hi = readDouble(), weight = readDouble();
    		  sum += lo / hi * weight;
    		  if(weight > max) { max = weight; minus = lo / hi * weight;}
    	  }
    	  if(bool) sum = sum - minus + max; else sum -= minus;
    	  pw.println((int)(Math.round(100 * sum))); pw.close();
      }
      static class Mark implements Comparable<Mark>{
    	  double score, weight; public Mark(double score, double weight) {this.score = score; this.weight = weight;}
    	  public int compareTo(Mark o) {
    		  return Double.compare(weight, o.weight);
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
