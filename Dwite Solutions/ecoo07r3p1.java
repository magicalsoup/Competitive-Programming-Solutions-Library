import java.util.*;
import java.io.*;
    public class ecoo07r3p1{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  for(int t = 0; t < 5; t++) {
    		  int n = readInt();
    		  if(isPrime(n)) {pw.println(n + " = " + n);}
    		  else if(n % 2 == 0) { Pair p = solve(n); pw.println(n + " = " + p.f + " + " + p.s);}
    		  else {
    			  for(int i = n / 3; i >= 3; i--) {
    				  if(!isPrime(i)) continue;
    				  Pair ans = solve(n - i);
    				  if(ans.f < i) continue;
    				  pw.println(n + " = " + i + " + " + ans.f + " + " + ans.s); break;
    			  }
    		  }
    	  }
    	  pw.close();
      }
      static class Pair{
    	  int f, s; public Pair(int f, int s) {this.f = f; this.s = s;}
      }
      static Pair solve(int x) {
    	  for(int i = x / 2; i >= 3; i--)
    		  if(isPrime(i) && isPrime(x - i)) return new Pair(i, x - i);
    	  return new Pair(x, x);
      }
      static boolean isPrime(int x) {
    	  if(x <= 2) return false;
    	  for(int i = 2; i <= Math.sqrt(x); i++)
    		  if(x % i == 0) return false;
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
