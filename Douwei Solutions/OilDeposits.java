package Douwei;
import java.util.*;
public class OilDeposits {
	static int n,m;
	static char [][] grid = new char[100][100];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int ans = 0;
			 n = sc.nextInt();
			 m = sc.nextInt();
			if(n==0&&m==0) {
				break;
			}
			for(int i =0 ;i<n;i++) {
				String str = sc.next();
				for(int j=0;j<m;j++) {
					grid[i][j] = str.charAt(j);
				}
			}
			for(int i =0 ;i <n;i++) {
				for(int j=0;j<m;j++) {
					if(grid[i][j]=='@') {
						ans++;
						fill(i,j);
					}
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
	static void fill(int r,int c) {
		if(r<0||c<0||r==n||c==m||grid[r][c]=='*')
			return;
		grid[r][c] = '*';
		fill(r+1, c+1);
		fill(r+1, c);
		fill(r+1,c-1);
		fill(r,c+1);
		fill(r,c-1);
		fill(r-1,c+1);
		fill(r-1,c);
		fill(r-1,c-1);
	}
}
