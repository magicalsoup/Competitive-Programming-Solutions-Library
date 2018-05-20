import java.util.*;
import java.io.*;
public class coci084p3{
	static BufferedReader br;
	static StringTokenizer st;
	static PrintWriter out;
	static int R,C,rot;
	static char[][] grid;
public static void main(String[]args) throws IOException{
	br = new BufferedReader(new InputStreamReader(System.in));
	out = new PrintWriter(new OutputStreamWriter(System.out));
	R = readInt();
	C = readInt();
	grid = new char[R][C];
	for(int i=0;i<R;i++)
		grid[i] = readLine().toCharArray();
	rot = readInt();
	while(rot>=90) {
		rot-=90;
		grid =rot90(grid);
	}
	if(rot>=45)
		grid = rot45(grid);
	for(int i=0;i<grid.length;i++) {
		for(int j=0;j<grid[0].length;j++) {
			out.print(grid[i][j]==' '?" ":grid[i][j]);
		}
		out.println();
	}
	out.close();
}
static char[][] rot45(char[][]g){
	R = grid.length;
	C = grid[0].length;
	char[][] ret = new char[R+C][R+C-1];
	for(int i=0;i<R+C;i++) 
		for(int j=0;j<R+C-1;j++)
			ret[i][j] = ' ';
	for(int i=0;i<R;i++) {
		for(int j=0;j<C;j++) {
			ret[i+j][R-1-i+j]=g[i][j];
		}
	}
	return ret;
}
static char [][] rot90(char[][]g){
	R = grid.length;
	C = grid[0].length;
	char[][] ret = new char[C][R];
	for(int i=0;i<R;i++) {
		for(int j =0;j<C;j++) {
			ret[j][R-i-1] = g[i][j];
		}
	}
	return ret;
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
