import java.util.*;
import java.io.*;
    public class dwite07c2p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int cnt = 0;
    	  for(int t = 0; t < 5; t++) {
    		  String s = next(); boolean neg = false;
    		  for(int i = 0; i < s.length(); i++) {
    			  char c = s.charAt(i);
    			  if(cnt < 0) { pw.println("OH NOES!"); neg = true; cnt = 0; break;}
    			  if(c == '+') cnt++;
    			  else cnt--;
    		  }
    		  if(!neg) pw.println(cnt);
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
