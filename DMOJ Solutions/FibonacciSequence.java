import java.util.*;
import java.math.*;
import java.io.*;
public class FibonacciSequence {
	// source: https://www.ics.uci.edu/~eppstein/161/960109.html
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static final long MOD = 1000000007;
    static final BigInteger Zero = BigInteger.ZERO;
    static final BigInteger One = BigInteger.ONE;
    static final BigInteger Two = new BigInteger("2");
	public static void main(String[] args) throws IOException{
		BigInteger n = new BigInteger(next()); pw.println(fib(n)); pw.close();
	}
    static long fib(BigInteger n) { 
	    long F[][] = new long[][]{{1,1},{1,0}}; 
	    if (n.compareTo(Zero) == 0) return 0; 
	    power(F, n.subtract(BigInteger.ONE));
	    return F[0][0]; 
	} 
	       
	static void multiply(long F[][], long M[][]) { 
	    long x =  F[0][0]*M[0][0] + F[0][1]*M[1][0]; 
	    long y =  F[0][0]*M[0][1] + F[0][1]*M[1][1]; 
	    long z =  F[1][0]*M[0][0] + F[1][1]*M[1][0]; 
	    long w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
	    x %= MOD; y %= MOD; z %= MOD; w %= MOD;
	    F[0][0] = x; 
	    F[0][1] = y; 
	    F[1][0] = z; 
	    F[1][1] = w; 
	} 
	
	static void power(long F[][], BigInteger n) { 
	    if( n.compareTo(Zero) == 0 || n.compareTo(One) ==  0) return; 
	    long M[][] = new long[][]{{1,1},{1,0}}; 
	    power(F, n.divide(Two)); 
	    multiply(F, F); 
	    if (n.mod(Two).compareTo(Zero) != 0) multiply(F, M); 
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
