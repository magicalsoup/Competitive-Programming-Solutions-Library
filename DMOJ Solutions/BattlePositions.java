 import java.util.*;
 import java.io.*;
    public class BattlePositions{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int stations = readInt(), n = readInt(), waves = readInt(), a[] = new int[10000001], cnt = 0;
    	  for(int i = 0; i < waves; i++) { int xi = readInt(), xf = readInt(), k = readInt(); a[xi] += k; a[xf + 1] -= k;}
    	  if(a[0] < n) cnt++;
    	  for(int i = 1; i < stations; i++) { a[i] += a[i - 1]; if(a[i] < n) cnt++;}
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
