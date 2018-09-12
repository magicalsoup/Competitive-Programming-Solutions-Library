package Douwei;
import java.util.*;
public class LETTERSBacktrack {
	static char[][] a = new char[100][100];
	static int b[] = new int[100];
	static int m,n,s = 0;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 m = sc.nextInt();
		 n = sc.nextInt();
		for(int i = 0; i < m; i++) {
			String str = sc.next();
			for(int j = 0; j<n; j++) {
				a[i][j]	= str.charAt(j);
			}
		}
		dfs(0, 0, 1);
		System.out.println(s);
		sc.close();
	}
	static int dfs(int i, int j, int c) {
		b[a[i][j]] = 1;
		if(i>0&&b[a[i-1][j]]==0) dfs(i-1,j,c+1);
		if(j>0&&b[a[i][j-1]]==0) dfs(i,j-1,c+1);
		if(i+1<m&&b[a[i+1][j]]==0) dfs(i+1,j,c+1);
		if(j+1<m&&b[a[i][j+1]]==0) dfs(i,j+1,c+1);
		if(s<c)
			s = c;
		b[a[i][j]] = 0;
		return 0;
	}
}
