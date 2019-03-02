import java.util.*;
import java.io.*;
public class ccc00s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		ArrayList<Double> rivers = new ArrayList<Double>();
		int n = readInt(); for(int i = 0; i < n; i++) rivers.add(readDouble());
		while(true) {
			int op = readInt();
			if(op == 77) break;
			if(op == 99) {
				int idx = readInt() - 1;
				double percent = readDouble();
				rivers.add(idx + 1, rivers.get(idx)  * (100 - percent) / 100.0);
				rivers.set(idx, rivers.get(idx) * (percent / 100.0 ));
			}
			if(op == 88) {
				int idx = readInt() - 1;
				rivers.set(idx, rivers.get(idx) + rivers.get(idx + 1));
				rivers.remove(idx + 1);
			}
		}
		for(Double d : rivers) 
			System.out.print(Math.round(d) + " ");
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static double readDouble() throws IOException{
		return Double.parseDouble(next());
	}
	static String readLine() throws IOException{
		return br.readLine().trim();
	}
}
