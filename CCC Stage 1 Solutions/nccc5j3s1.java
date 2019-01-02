import java.util.*;
import java.io.*;
public class nccc5j3s1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), x = readInt(), a[] = new int[n], cnt = 0;
    	  for(int i = 0; i < n; i++) a[i] = readInt();
    	  for(int i = 0; i < n; i++) {
    		  for(int j = i + 1; j < n; j++) {
    			  for(int k = j + 1; k < n; k++) {
    				  int b[] = new int[3];
    				  b[0] = a[i]; b[1] = a[j]; b[2] = a[k];
    				  Arrays.sort(b);
    				  if(b[1] == x) cnt++;
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
