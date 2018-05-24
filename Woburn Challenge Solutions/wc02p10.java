import java.util.*;
public class wc02p10 {
	static Scanner sc = new Scanner(System.in);
	static final int INF = 0x3f3f3f3f;
	public static void main(String[]args) {
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int maze[][] = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					maze[i][j] = sc.nextInt();
				}
			}
			for(int i=1;i<m;i++) {
				for(int j=0;j<n;j++) {
					int mini = INF;
					for(int x=0;x<n;x++) {
						if(x!=j)
							mini = Math.min(mini, maze[x][i-1]);
					}
				maze[j][i] += mini;
				}
			}
		int mini = INF;
		for(int i=0;i<n;i++) {
			mini = Math.min(mini, maze[i][m-1]);
			}
		System.out.println(mini);
		}
	}
}
