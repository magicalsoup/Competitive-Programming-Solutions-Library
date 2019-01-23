import java.util.*;
import java.io.*;
public class slpr1p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(), q = readInt(); long psa1[] = new long[n + 1], psa2[] = new long[n + 1];
		for(int i = 1; i <= n; i++) {psa1[i] = readLong(); psa1[i] += psa1[i - 1];}
		for(int i = 1; i <= n; i++) {psa2[i] = readLong(); psa2[i] += psa2[i - 1];}
		for(int i = 0; i < q; i++) {
			int l = readInt(), r = readInt();
			if(psa1[r] - psa1[l - 1] == psa2[r] - psa2[l - 1]) pw.println("WOOHOO!");
			else pw.println("BOOHOO!");
		}
		pw.close();
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
}
