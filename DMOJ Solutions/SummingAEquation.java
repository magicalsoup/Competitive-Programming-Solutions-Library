import java.util.*;
import java.io.*;
    public class SummingAEquation{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), arr[] = new int[n];
    	  for(int i = 0; i < arr.length; i++) arr[i] = readInt();
    	  pw.println(solve(arr, n)); pw.close();
      }
      static long solve(int arr[], int n) {
    	  long a = arr[0];
    	  long b = 0;
    	  for(int i = 1; i < n; i++) {
    		  long e = a > b? a : b;
    		  a = b + arr[i];
    		  b = e;
    	  }
    	  return a > b? a : b;
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
