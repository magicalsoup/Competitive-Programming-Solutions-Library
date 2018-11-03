import java.util.*;
import java.io.*;
    public class AdminWar{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(), a[] = new int[n], b[] = new int[n], fatalEagle = 0, xyene = 0;
    	  for(int i = 0; i < n; i++) a[i] = readInt(); for(int i = 0; i < n; i++) b[i] = readInt();
    	  for(int i = 0; i < n; i++) {if(b[i] > a[i]) fatalEagle++; if(a[i] > b[i]) xyene++;}
    	  pw.println(xyene + " " + fatalEagle);
    	  if(xyene > fatalEagle) pw.println("Xyene");
    	  else if(fatalEagle > xyene) pw.println("FatalEagle");
    	  else pw.print("Tie"); pw.close();
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
