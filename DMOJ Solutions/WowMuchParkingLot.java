import java.util.*;
import java.io.*;
    public class WowMuchParkingLot{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); int x = 0, y = 0;
    	  for(int i = 0; i < n; i++) {
    		  String dir = next(); int b = readInt();
    		  if(dir.equals("North")) y += b;
    		  if(dir.equals("South")) y -= b;
    		  if(dir.equals("West")) x -= b;
    		  if(dir.equals("East")) x += b;
    	  }
    	  pw.println(x + " " + y); pw.close();
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
