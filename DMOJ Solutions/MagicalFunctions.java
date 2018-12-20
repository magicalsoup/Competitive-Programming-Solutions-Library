import java.io.*;
import java.util.*;
public class MagicalFunctions{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static final int MOD = 1000000007;
    static int a , b, c, d, e;
    public static void main(String[]args) throws IOException{
    	a = readInt(); b = readInt(); c = readInt(); d = readInt(); e = readInt(); int n = readInt();
    	pw.println(solve(n % MOD) % MOD); pw.close();
    }
    static long solve(int x){
    	if(x == 0) return e % MOD;
    	int abs1 = (int)Math.floor(x / b),  abs2 = (int)Math.floor(x / d);
    	return (a * solve(abs1) + c * solve(abs2)) % MOD;
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
