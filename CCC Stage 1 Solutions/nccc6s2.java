import java.util.*;
public class nccc6s2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),  a[][] = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				a[i][j] = sc.nextInt();
		
		int num = 1, cnt = 0;
		for(int i = 1; i <= n; i++) { 
			for(int j = 1; j <= n; j++) {
				if(a[i][j] != num) cnt++;
				num++;
			}
		}
		
		double ans = Math.ceil(Math.sqrt(cnt));
		System.out.println((int)(ans)); sc.close();
	}
}
