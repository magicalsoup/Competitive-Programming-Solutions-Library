import java.io.*;
import java.util.*;
public class cheasy {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args) throws IOException{
	int m = readInt();
	int n = readInt();
	long[][] board = new long[m+2][n+2];
	long ans =0;
	while(true) {
		int r = readInt();
		int c = readInt();
		int x = readInt();
		if(r==0&&c==0&&x==0)break;
		if((r+c)%2!=0) board[r][c] = x;
		else board[r][c] = -x;
	}
	for(int i=1;i<=m;i++) {
		for(int j =1;j<=n;j++) {
			board[i][j] +=board[i-1][j]+board[i][j-1]-board[i-1][j-1];
		}
	}
	while(true) {
		int r1 = readInt();
		int c1 = readInt();
		int r2 = readInt();
		int c2 = readInt();
		if(r1==0&&c1==0&&r2==0&&c2==0) break;
			ans = board[r2][c2]+board[r1-1][c1-1]-board[r1-1][c2]-board[r2][c1-1];
			if((r1+c1)%2!=0) {
				System.out.println(ans);
			}
			else {
				System.out.println(-ans);
			}
	}
}
static String next() throws IOException{
    while(st==null||!st.hasMoreTokens())
    st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
}
static long readLong() throws IOException{
    return Long.parseLong(next());
}
static int readInt() throws IOException{
    return  Integer.parseInt(next());
}
 static double readDouble() throws IOException{
    return  Double.parseDouble(next());
}
static char readCharacter() throws IOException{
    return next().charAt(0);
}
static String readLine() throws IOException{
    return br.readLine().trim();
}
}
