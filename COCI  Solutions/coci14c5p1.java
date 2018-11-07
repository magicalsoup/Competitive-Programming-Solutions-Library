import java.util.*;
import java.io.*;
    public class coci14c5p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int a[] = new int[16]; for(int i = 0; i < 8; i++) a[i] = a[i + 8] = readInt(); int max = -1;
    	  for(int i = 0; i < a.length - 3; i++) max = Math.max(max, a[i] + a[i + 1] + a[i + 2] + a[i + 3]);
    	  pw.println(max); pw.close();
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
