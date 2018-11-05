import java.util.*;
import java.io.*;
    public class dwite11c4p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int s;
      public static void main(String[]args) throws IOException{
    	  for(int x = 0; x < 5; x++) {
    		  int n = readInt(); boolean flag = true;
    		  for(int i = 2; i <= n; i++) {
    			  if(!prime(i)) continue;
    			  if(flag) flag = false;
    			  else pw.print(" * ");
    			  pw.print(i + "^" + factors(n, i));
    		  }
    		  pw.println();
    	  }
    	  pw.close();
      }
      static int factors(int n, int p) {
    	  	int ans = 0;
    	  	for(; n >= p; n /= p) 
    	  		ans += n/ p;
    	  	return ans;
      }
      static boolean prime(int n) {
    	  for(int i = 2; i <= Math.sqrt(n); i++)
    		  if(n % i == 0) return false;
    	  return true;
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
