import java.util.*;
import java.io.*;
    public class WorldTradeFoundation{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), k = readInt(), a[] = new int[n], cnt = 0, ans = 0;
    	  for(int i = 0; i < n; i++) a[i] = readInt(); Arrays.sort(a);
    	  for(int i = n - 1; i >= 0; i--) {
    		  cnt = 0;
    		  while(cnt + a[i] <= k) {cnt+= a[i]; ans++;} k -= cnt;
    		  if(k < 0) break;
    	  }
    	  if(k == 0) pw.println(ans); 
    	  else pw.println(-1); pw.close();
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
