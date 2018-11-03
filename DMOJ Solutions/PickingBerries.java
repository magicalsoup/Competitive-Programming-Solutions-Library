import java.util.*;
import java.io.*;
    public class PickingBerries{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int w = readInt(), h = readInt(); String berries = ""; char a[][] = new char[h][w];
    	  for(int i = 0; i < h; i++) a[i] = readLine().toCharArray();
    	  for(int i = 0; i < a.length; i++) {
    		  for(int j = 0; j < a[i].length; j++) {
    			  if(a[i][j] == '*') pw.print(" ");
    			  else if(a[i][j] == 'o') {pw.print(" "); berries += a[i][j];}
    			  else pw.print(a[i][j]);;
    		  }
    		  pw.println();
    	  }
    	  pw.println(berries); pw.close();
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
