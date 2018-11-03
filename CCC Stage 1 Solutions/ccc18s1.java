import java.util.*;
import java.io.*;
    public class ccc18s1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), a[] = new int[n]; double min = Double.MAX_VALUE;
    	  for(int i = 0; i < n; i++) a[i] = readInt(); Arrays.sort(a);
    	  for(int i = 1; i < n - 1; i++) {
    		  double dist = Math.abs(a[i] - a[i - 1]) / 2.0 + Math.abs(a[i] - a[i + 1]) / 2.0; min = Math.min(min, dist);
    	  }
    	  pw.printf("%.1f\n",min); pw.close();
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
