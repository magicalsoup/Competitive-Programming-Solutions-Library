import java.util.*;
import java.io.*;
    public class SplittingASequence{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static long min = -1;
      static long ans = Integer.MAX_VALUE;
      public static void main(String[]args) throws IOException{
    	 int n = readInt(), k = readInt(); long a[] = new long[n]; long max = -1; long sum = 0;
    	 for(int i = 0; i < n; i++) {a[i] = readLong(); max = Math.max(max, a[i]); sum += a[i];}
    	 pw.println(solve(a, n ,k, sum, max)); pw.close();
      }	
      static boolean check(long a[], long mid, long m) {
    	  long cnt = 1, sum = 0;
    	  for(int i = 0; i < a.length; i++) { sum += a[i]; if(sum > mid) { cnt++; sum = a[i];}}
    	  return cnt <= m;
      }
      static long solve(long a[], int n, int m, long sum, long max) {
    	  long left = max, right = sum;
    	  while(left < right) {
    		  long mid = (left + right) / 2;
    		  if(check(a, mid, m)) right = mid;
    		  else left = mid + 1;
    	  }
    	  return left;
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
