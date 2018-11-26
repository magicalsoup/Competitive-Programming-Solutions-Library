import java.util.*;
import java.io.*;
    public class Recruits{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); int a[] = new int[21]; for(int i = 0; i < n; i++) a[i] = readInt(); int cnt = 0;
    	  for(int i = 0; i < n; i++) {
    		  if(i == 0) { if(a[i + 1] <= 41 && a[i] <= 41) cnt++; }
    		  else { if(a[i - 1] <= 41 && a[i] <= 41 && a[i + 1] <= 41) cnt++;}
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
