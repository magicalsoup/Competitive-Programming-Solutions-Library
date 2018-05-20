import java.io.*;
import java.util.*;

public class dp1p3 {

        public static BufferedReader br;
	public static PrintWriter out;
	public static StringTokenizer st;
	
        public static int N, max = 0;
        public static int [] arr;
        public static int [] dp;
  
	public static void main (String[] t) throws IOException {
  	br = new BufferedReader(new InputStreamReader(System.in));
	out = new PrintWriter(new OutputStreamWriter(System.out));
        N = readInt();
        arr = new int [N];
        dp = new int [N + 1];
        for (int i=0; i<N; i++) 
          arr[i] = readInt();
	for (int i=0; i<arr.length; i++) dp[i] = 1; 
	for (int i=1; i<arr.length; i++)
		for (int j=0; j<i; j++)
			if (arr[j] < arr[i]) 
				dp[i] = Math.max (dp[i], dp[j] + 1);
	for (int i = 0; i < arr.length; i++)
		max = Math.max (max, dp[i]);
		System.out.println(max);
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


		static char readCharacter () throws IOException {
			return next().charAt(0);
		}


		static String readLine () throws IOException {
			return br.readLine().trim();
		}
	}
