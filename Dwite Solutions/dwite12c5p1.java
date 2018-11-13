import java.util.*;
import java.io.*;
   public class dwite12c5p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++){
    			String time = next();
    			int journey = readInt(); int timezone = readInt(); int arrivalHour = (Integer.parseInt(time.substring(0, 2)) + journey + timezone + 48) % 24;
    			pw.printf("%02d%s%n", arrivalHour, time.substring(2));
    	  }
    	  pw.close();
      }
      static void print(String s, int n){
    	  for(int i = 0; i < n; i++) pw.print(s);
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
