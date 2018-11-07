import java.util.*;
import java.io.*;
    public class BubbleSort{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); int a[] = new int[n];
    	  for(int i = 0; i < n; i++) a[i] = readInt(); boolean isSorted = false;
		  for(int j = 0; j < a.length; j++) pw.print(a[j] + " "); pw.println();
    	  while(!isSorted) {
    		  isSorted = true;
    		  for(int i = 0; i < a.length -1; i++) {
    			  if(a[i] > a[i + 1]) {
    				  int temp = a[i]; a[i] = a[i + 1]; a[i + 1] = temp; isSorted = false;
        			  for(int j = 0; j < a.length; j++) pw.print(a[j] + " "); pw.println();
    			  }
    		  }
    	  }
    	  pw.close();
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
