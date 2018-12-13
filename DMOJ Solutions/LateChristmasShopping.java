import java.util.*;
import java.io.*;
    public class LateChristmasShopping{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    	  for(int i = 0; i <= 3; i++) a.add(new ArrayList<Integer>());
    	  for(int i = 0; i < n; i++) {int m = readInt(); while(m -- > 0) a.get(i).add(readInt());}
    	  for(int i = 0; i < n; i++) {for(int x : a.get(i + 1))if(a.get(i).contains(x)) {pw.println("YES"); pw.close(); return;}}
    	  pw.println("NO"); pw.close(); 
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
