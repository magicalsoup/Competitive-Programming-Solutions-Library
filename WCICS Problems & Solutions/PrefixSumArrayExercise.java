import java.util.*;
import java.io.*;
public class PrefixSumArrayExercise {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt(), q = readInt();
		long psa[] = new long[n + 1];
		for(int i = 1; i <= n; i++) {
			psa[i] = readLong();
			psa[i] += psa[i-1];
		}
		for(int i = 0; i < q; i++) {
			int l = readInt(), r = readInt();
			pw.println((psa[r] - psa[l-1]));
		}
		pw.close();
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
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
