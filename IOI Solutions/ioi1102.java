import java.util.*;
import java.io.*;
public class ioi1102{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main (String[] args) throws IOException{
		int n = readInt();
		int t = readInt();
		int max =0;
		int []temps = new int[n+1];
		for(int i=1;i<=n;i++) {
			temps[i] = readInt();
			temps[i] =temps[i]+temps[i-1];
		}
		for(int i =t;i<=n;i++) {
			max = Math.max(max,temps[i]-temps[i-t]);
		}
		System.out.println(max);
		
	}
	 static String next() throws IOException{
	        while(st==null||!st.hasMoreTokens())
	        st = new StringTokenizer(br.readLine().trim());
	        return st.nextToken();
	    }
	    static long readLong() throws IOException{
	        return Long.parseLong(next());
	    }
	    static int readInt() throws IOException{
	        return  Integer.parseInt(next());
	    }
	     static double readDouble() throws IOException{
	        return  Double.parseDouble(next());
	    }
	    static char readCharacter() throws IOException{
	        return next().charAt(0);
	    }
	    static String readLine() throws IOException{
	        return br.readLine().trim();
	    }
}
