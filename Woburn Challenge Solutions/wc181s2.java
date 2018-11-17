import java.util.*;
import java.io.*;
    public class wc181s2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int w = readInt(); 
    	  for(char i = 'a' - 1; i <= 'z'; i++) {
    		  for(char j = (char) ('a' - (i < 'i'? 1 : 0)); j <= 'z'; j++) {
    			  for(char k = 'a'; k <= 'z'; k++) {
    				  if(i >= 'a') pw.print(i);
    				  if(j >= 'a') pw.print(j);
    				  pw.print(k); w--;
    				  if(w > 0) pw.print(" ");
    				  else { pw.println(); pw.close();return;}
    			  }
    		  }
    	  }
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
