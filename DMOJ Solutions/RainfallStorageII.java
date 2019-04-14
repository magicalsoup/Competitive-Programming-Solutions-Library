import java.util.*;
import java.io.*;
public class RainfallStorageII {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt();
		int a[] = new int[n + 1], pmax[] = new int[n + 1], smax[] = new int[n+1];
		for(int i = 1; i <= n; i++) a[i] = readInt();
		
		for(int i = 1; i <= n; i++) pmax[i] = Math.max(pmax[i-1], a[i]);
		smax[n] = a[n];
		for(int i = n-1; i > 0; i--) smax[i] = Math.max(smax[i + 1], a[i]);
		
		long sum = 0;	
		for(int i = 1; i <= n; i++) {
			int h = Math.min(pmax[i], smax[i]);
			sum += h - a[i];
		}
		System.out.println(sum);
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
