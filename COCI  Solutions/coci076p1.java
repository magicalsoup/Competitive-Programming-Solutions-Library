import java.util.*;
import java.io.*;
public class coci076p1{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
				int[] parking = new int[101];
				int a = readInt();
				int b = readInt();
				int c = readInt();
				for(int x=0;x<3;x++) {
					parking[readInt()-1]++;
					parking[readInt()-1]--;
				}
				int curr =0;
				int sum =0;
				for(int x =0;x<101;x++) {
					parking[x]+=curr;
					curr = parking[x];
					switch(parking[x]) {
					case 1:
						sum+=a;
						break;
					case 2:
						sum+=b*2;
						break;
					case 3:
						sum+=c*3;
					}
				}
				System.out.println(sum);
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
