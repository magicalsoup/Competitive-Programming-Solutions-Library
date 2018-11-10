import java.util.*;
import java.io.*;
    public class dwite10c2p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  String a = next(), b = next();
    		  if(a.length() != b.length()) pw.println("different");
    		  else {
    			  boolean same = true;
    			  for(int i = 0; i < a.length(); i++){if(vowel(a.charAt(i)) != vowel(b.charAt(i))) { same = false; break;}}
    			  if(!same) pw.println("different");
    			  else pw.println("same");
    		  }
    	  }
    	  pw.close();
      }
      static int vowel(char c) {
    	  if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') return 1;
    	  return 0;
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
