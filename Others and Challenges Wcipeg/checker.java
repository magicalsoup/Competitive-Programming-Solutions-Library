import java.util.*;
import java.io.*;
public class checker {
static long bitboard[][];
static int m,n;
public static void main(String[]args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	m = Integer.parseInt(st.nextToken());
	n = Integer.parseInt(st.nextToken());
	int board [][] = new int[3001][3001];
	bitboard = new long[3001][3001];
	while(true) {
		st = new StringTokenizer(br.readLine());
		int com = Integer.parseInt(st.nextToken());
		if(com==0)break;
		else if(com==1) {
			int r = Integer.parseInt(st.nextToken()),c = Integer.parseInt(st.nextToken()),
			value = Integer.parseInt(st.nextToken());
			if((r+c)%2==1) {
				int change = board[r][c]+value;
				for(int i=r;i<=m;i+=i&-i) {
					for(int j=c;j<=n;j+=j&-j) {
						bitboard[i][j]+=change;
					}
				}
				board[r][c] = -value;
			}
			else {
				int change = board[r][c]-value;
				for(int i=r;i<=m;i+=i&-i) {
					for(int j=c;j<=n;j+=j&-j) {
						bitboard[i][j]+=change;
					}
				}
				board[r][c] = value;
			}
		}
		else {
			int r1 = Integer.parseInt(st.nextToken())-1,c1 = Integer.parseInt(st.nextToken())-1,
			r2 = Integer.parseInt(st.nextToken()), c2 = Integer.parseInt(st.nextToken());
			long sum = sum(r2,c2)- sum(r2,c1)-sum(r1,c2)+sum(r1,c1);
			if((r1+c1)%2==1)
				System.out.println(sum);
			else
				System.out.println(-sum);
		}
	}
}
public static long sum(int x,int y) {
	long sum =0;
	for(int i=x;i>0;i-=i&-i) {
		for(int j=y;j>0;j-=j&-j) {
			sum+=bitboard[i][j];
		}
	}
return sum;
}
}
