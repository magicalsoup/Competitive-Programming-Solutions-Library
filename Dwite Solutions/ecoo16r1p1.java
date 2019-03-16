import java.util.*;
import java.io.*;
    public class ecoo16r1p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int i=0;i<10;i++) {
    		  double a = readDouble(), b = readDouble(), c = readDouble(), d = readDouble(); int num = readInt(), counter = 0;
    		  for(int j=0;j<num;j++) {
    			  double test = readDouble(), assignments = readDouble(), project = readDouble(), quiz = readDouble();
    			  if(test * a / 100 + assignments * b / 100 + project * c / 100 + quiz * d / 100 >= 49.9) counter++;
    		  }
    		  out.println(counter);
    	  }
    	  out.close();
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
