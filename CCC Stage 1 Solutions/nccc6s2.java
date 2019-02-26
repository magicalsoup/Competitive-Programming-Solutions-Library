import java.util.*;
import java.io.*;
public class nccc6s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int n = readInt(),  a[][] = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				a[i][j] = readInt();
		
		int num = 1, cnt = 0;
		for(int i = 1; i <= n; i++) { 
			for(int j = 1; j <= n; j++) {
				if(a[i][j] != num) cnt++;
				num++;
			}
		}
		
		double ans = Math.ceil(Math.sqrt(cnt));
		System.out.println((int)(ans));
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
