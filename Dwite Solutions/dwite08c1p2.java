import java.util.*;
import java.io.*;
    public class dwite08c1p2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  char alpha[] = new char[26]; for(int i = 'A'; i <= 'Z'; i++) alpha[i % 26] = (char)(i); Arrays.sort(alpha);
    	  for(int t = 0; t < 5; t++) {
    		  String s = next(); char c = next().charAt(0);
    		  int index = getSum(String.valueOf(getSum(s)));
    		  if(alpha[index - 1] == c) pw.println("match");
    		  else pw.println("error");
    	  }
    	  pw.close();
      }
      static int getSum(String s) {
    	  int res = 0;
    	  for(int i = 0; i < s.length(); i++) res += Integer.parseInt(s.charAt(i) + "");
    	  return res;
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
