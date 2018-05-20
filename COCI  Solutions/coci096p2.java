import java.util.*;
import java.io.*;
public class coci096p2{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt();
		int s = readInt();
		int r= readInt();
		int[]c = new int[n+2];
		for(int x=0;x<s;x++)
			c[readInt()]--;
		for(int x=0;x<r;x++) {
			int a = readInt();
			if(c[a-1]==-1) {
				c[a-1]++;
				s--;
			}
			else if(c[a+1]==-1) {
				c[a+1]++;
				s--;
			}
		}
		System.out.println(s);
	}
	static String next() throws IOException{
		while(st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static  double readDouble() throws IOException{
		return Double.parseDouble(next());
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
	static String readLine() throws IOException{
		return br.readLine().trim();
	}
}
