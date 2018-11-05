import java.util.*;
import java.io.*;
    public class LargestMinimumDistance{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int s;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), m = readInt(), a[] = new int[n];
    	  for(int i = 0; i < n; i++) a[i] = readInt();
    	  pw.println(solve(a, a.length, m)); pw.close();
      }
      static boolean check(int mid, int arr[], int n, int k){ 
			int pos = arr[0], elements = 1;  
			for (int i = 1; i < n; i++) { 
				if (arr[i] - pos >= mid) { 
					pos = arr[i]; elements++; 
					if (elements == k) return true; 
				} 
			} 
			return false; 
      }	 
      static int solve(int arr[], int n, int k){ 
    	Arrays.sort(arr);
		int res = -1;  
		int left = arr[0], right = arr[n - 1]; 
		while (left < right) { 
			int mid = (left + right) / 2;  
		    if (check(mid, arr, n, k)) { res = Math.max(res, mid); left = mid + 1;} 
			else right = mid; 
		} 
		return res; 
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
