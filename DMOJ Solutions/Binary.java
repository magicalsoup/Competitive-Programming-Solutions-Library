import java.util.*;
import java.io.*;
public class Binary{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); 
    	  while(n-- > 0) {
    		  int a = readInt(); String res = toBinary(a); int len = res.replace(" ", "").length(); String ans = "";
    		  while(len % 4 != 0 || len == 0) { ans += "0"; len++;}
    		  ans += res; for(int i = 0; i < ans.length(); i++) pw.print(ans.charAt(i));
    		  pw.println();
    	  } pw.close();
      }
      public static String toBinary(int n) {
    	  String res = ""; int index = 0;
    	  while(n > 0) {
    		  res += n % 2; n /= 2; index++;
    		  if(index == 4) { res += " "; index = 0;}
    	  }
    	  StringBuilder sb = new StringBuilder(); sb.append(res);
    	  return sb.reverse().toString();
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
