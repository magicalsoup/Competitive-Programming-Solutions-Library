import java.io.*;
import java.util.*;
public class ASubtractingProblem {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt();
		for(int i = 0; i < n; i++) {
			int a = readInt(), b = readInt();
			pw.println(b > a? a-b : b-a);
		}
		pw.close();
	}
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
}
