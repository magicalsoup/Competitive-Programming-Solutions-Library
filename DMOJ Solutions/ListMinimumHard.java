import java.io.*;
import java.util.*;
public class ListMinimumHard {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(); Integer a[] = new Integer[n];
		for(int i = 0; i < n; i++) a[i] = readInt();
		Arrays.sort(a); 
		for(int i = 0; i < n; i++) 
			pw.println(a[i]);
		pw.close();
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
