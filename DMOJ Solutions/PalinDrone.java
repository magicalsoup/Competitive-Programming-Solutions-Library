import java.util.*;
import java.io.*;
import java.math.BigInteger;
    public class PalinDrone{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static final int MOD = 1000000000;
      static BigInteger ZERO = new BigInteger("0");
      static BigInteger ONE = new BigInteger("1");
      static BigInteger TWO = new BigInteger("2");
      static BigInteger TEN = new BigInteger("10");
      public static void main(String[]args) throws IOException{
    	  BigInteger n = new BigInteger(next());
    	  if(n.mod(TWO).compareTo(ONE) == 0) {long ans = pow(10, n.add(ONE).divide(TWO)) + pow(10, n.subtract(ONE).divide(TWO)); pw.println((ans - 2 + MOD) % MOD);}
    	  else { long ans = 2 * pow(10, n.add(ONE).divide(TWO)); pw.println((ans - 2 + MOD) % MOD);} pw.close();
      }
      static long pow(long base, BigInteger pow) {
    	  if(pow.equals(ZERO)) return 1;
    	  if(pow.equals(ONE)) return base;
    	  if(pow.mod(TWO).equals(ZERO)) return pow(base * base % MOD, pow.divide(TWO));
    	  return base * pow(base * base % MOD, pow.divide(TWO)) % MOD;
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
