import java.util.*;
import java.io.*;
    public class ecoo13r1p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  for(int i = 0; i < 5; i++) {
    			  String n = next();
    			  int ans = 0, curr = 0; boolean flag = true;
    			  for(int j = n.length() - 1; j >=0; j--) {
    				  int num = n.charAt(j) - '0';
    				  if(flag) {
    					  curr = num * 2;
    					  while(curr != 0) {
    						  ans += curr % 10;
    						  curr /= 10;
    					  }
    				  }
    				  else ans += num;
    				  flag = !flag;
    			  }
    			  pw.print((10 - ans % 10) % 10); 
    		  }
    		  pw.println();
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
