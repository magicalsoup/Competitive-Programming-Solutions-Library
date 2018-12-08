import java.util.*;
import java.io.*;
public class TheMirror{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  int n = readInt(); 
    	  while(n-->0) {int a = readInt(), b = readInt(), cnt = 0; for(int i = a; i < b; i++) if(isPrime(i)) cnt++; pw.println(cnt);} pw.close();
      }
      static boolean isPrime(int n) {
    	  if(n <= 1) return false;
    	  if(n == 2) return true;
    	  for(int i = 2; i <= Math.sqrt(n); i++)
    		  if(n % i == 0) return false;
    	  return true;
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
