import java.util.*;
import java.io.*;
    public class Systests{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	int b = readInt(), s[] = new int[b], e[] = new int[b], p[] = new int[b];
    	for(int i = 0; i < b; i++) { s[i] = readInt(); e[i] = readInt(); p[i] = readInt();}
    	int f = readInt();  int t[] = new int[f]; for(int i = 0; i < f; i++) t[i] = readInt(); Arrays.sort(t); 
    	long ans = 0;
    	for(int i = 0; i < b; i++) {
    		int lo = lower_bound(t, s[i]);
    		int hi = upper_bound(t, e[i]);
    		if(hi < lo) ans += p[i];
    	}
    	pw.println(ans); pw.close();
      }
      static int upper_bound(int a[], int key) {
    	  int lo = 0, hi = a.length - 1;
    	  while(lo <= hi) {
    		  int mid = (lo + hi) / 2;
    		  if(a[mid] == key) lo = mid + 1;
    		  else if(a[mid] > key) hi = mid - 1;
    		  else lo = mid + 1;
    	  }
    	  return hi;
      }
      static int lower_bound(int a[], int key) {
    	  int lo = 0, hi = a.length - 1;
    	  while(lo <= hi) {
    		  int mid = (lo + hi) / 2;
    		  if(a[mid] == key) hi = mid - 1;
    		  else if(a[mid] > key) hi = mid - 1;
    		  else lo = mid + 1;
    	  }
    	  return lo;
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
