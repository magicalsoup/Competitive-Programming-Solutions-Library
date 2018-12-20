import java.io.*;
import java.util.*;
public class GoodNumbers{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException{
    	int n = readInt(), cnt = 0;
    	while(n-- > 0){ int a = readInt(); if(isGood(a)) cnt ++; }
    	pw.println(cnt); pw.close();
    }
    static boolean isGood(int n){
    	String s = ""; s+= n;; int cnt = 0;
    	for(int i = 0; i < s.length(); i++) cnt += Integer.parseInt(s.charAt(i)+"");
    	return isPrime(cnt) && isPrime(n);
    			
    }
    static boolean isPrime(int n){
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
