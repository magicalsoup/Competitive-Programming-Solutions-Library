import java.util.*;
import java.io.*;
public class ioi0913{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static String next() throws IOException{
		while(st==null||!st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	public static void main(String[]args) throws IOException{
		int con = readInt();
		int tasks = readInt();
		int pID = readInt()-1;
		int[] points = new int[tasks];
		boolean [][] cons = new boolean[con][tasks];
		int[][] conscore = new int[con][tasks];
		for(int x =0;x<con;x++) {
			for(int y =0;y<tasks;y++) {
				cons[x][y] = readInt()==1? true:false;
				conscore [x][1] += cons[x][y] ? 1:0;
				points [y] +=cons[x][y] ? 0:1;
			}
		}
	int place = 1;
	for(int x=0;x<con;x++) {
		for(int y=0;y<tasks;y++) {
			if(cons[x][y]) {
				conscore[x][0] +=points[y];
			}
		}
	}
	for(int x =0;x<con;x++) {
		if(x==pID) {
			continue;
		}
		if(conscore[x][0]>conscore[pID][0]) {
			place++;
		}
		else if(conscore[x][0]==conscore[pID][0]) {
			if(conscore[x][1]>conscore[pID][1]) {
				place++;
			}
			else if(conscore[x][1]==conscore[pID][1]&&x<pID) {
				place++;
			}
		}
	}
	System.out.println(conscore[pID][0]+" "+place);
	}
}
