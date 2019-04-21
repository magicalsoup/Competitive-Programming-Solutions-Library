import java.util.*;
import java.io.*;
public class coci15c4p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt(), m[][] = new int[n][n], a[] = new int[n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				m[i][j] = readInt();
		
		for(int i = 0; i < n; i++) {
			int ans = m[i][0];
			for(int j = 1; j < n; j++)
				ans |= m[i][j];
			a[i] = ans;
		}
		for(int i : a)
			pw.print(i + " ");
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
}
