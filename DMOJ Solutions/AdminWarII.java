import java.util.*;
import java.io.*;
public class AdminWarII {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {

		int n = readInt(); Integer a[] = new Integer[n], b[] = new Integer[n];
		for(int i = 0; i < n; i++) a[i] = readInt();
		for(int i = 0; i < n; i++) b[i] = readInt();
		Arrays.sort(a); Arrays.sort(b);
		
		int j = n-1;
		int xyene = 0;
		for(int i = n-1; i >= 0;) {
			int cur = a[j];
			if(cur > b[i]) {
				xyene++;
				j--;
				i--;
			}
			else {
				i--;
			}
		}
		System.out.println(xyene);
		j = n-1;
		int fataleagle = 0;
		for(int i = n-1; i >= 0;) {
			int cur = b[j];
			if(cur > a[i]) {
				fataleagle++;
				j--;
				i--;
			}
			else {
				i--;
			}
		}
		System.out.println(fataleagle);

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
