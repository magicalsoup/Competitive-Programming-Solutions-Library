import java.util.*;
import java.io.*;
   public class nccc3j2{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  String a = next(); pw.println(split(a)? "YES" : "NO"); pw.close();
      }
      static boolean split(String a){
    	  for(int i = 0; i < a.length(); i++){
    		  String x = a.substring(0, i), y = a.substring(i);
    		  if(palindrome(x) && palindrome(y)) return true;
    	  }
    	  return false;
      }
      static boolean palindrome(String a){
    	  if(a.length() == 0) return false;
    	  String res = ""; for(int i = a.length() - 1; i >= 0; i--) res += a.charAt(i);
    	  return a.equals(res);
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
