import java.util.*;
import java.io.*;
    public class FujoNeko{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int r = readInt(), c = readInt(); boolean[] a = new boolean[r], b = new boolean[c];
    	  for(int i = 0; i < r; i++) {
    		  String s = next();
    		  for(int j = 0; j < c; j++) { if(s.charAt(j) == 'X') { a[i] = true; b[j] = true;}}
    	  }
    	  int q = readInt();
    	  while(q-- > 0) {int x = readInt() - 1, y = readInt() - 1; pw.println( a[y] || b[x] ? "Y" : "N");}
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
