import java.util.*;
import java.io.*;
public class EXAM{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), a[] = new int[n], cnt = 0; for(int i = 0; i < n; i++) a[i] = readInt();
    	  boolean isSorted = false;
    	  while(!isSorted) {
    		  isSorted = true;
    		  for(int i = 1; i < n; i++) {
    			  if(a[i - 1] < a[i]) {
    				 int tmp =  a[i - 1];
    				 a[i - 1] = a[i];
    				 a[i] = tmp;
    				 cnt++;
    				 isSorted = false;
    			  }
    		  }
    	  }
    	  pw.println(cnt); pw.close();
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
