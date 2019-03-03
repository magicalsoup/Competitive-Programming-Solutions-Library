import java.util.*;
import java.io.*;
public class ecoo16r3p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static final int INF = 0x3f3f3f3f;
	public static void main(String[]args) throws IOException{
		int n = readInt(); TreeSet<String> set = new TreeSet<String>();
		for(int i = 0; i < n; i++) set.add(next());
		for(int t = 0; t < 10; t++) {
			String s = next();
			int dp[] = new int[s.length() + 1]; Arrays.fill(dp, INF);
			dp[s.length()] = 0;
			for(int i = s.length() - 1; i >= 0; i--) {
				for(int j = i + 1; j <= s.length(); j++) {
					if(set.contains(s.substring(i, j))) {
						dp[i] = Math.min(dp[i], dp[j] + 1);
					}
				}
			}
			System.out.println(dp[0] - 1);
		}
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
}
