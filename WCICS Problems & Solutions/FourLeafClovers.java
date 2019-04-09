import java.util.*;
public class FourLeafClovers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); char g[][] = new char[n][n];
		for(int i = 0; i < n; i++) g[i] = sc.next().toCharArray();
		
		int total = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(g[i][j] == 'S') {
					int up = i - 1, down = i + 1, right = j + 1, left = j - 1;
					if(in(up,n) && in(down, n) && in(right, n) && in(left, n) && g[up][j] == 'L' && g[down][j] == 'L' && g[i][right] == 'L' && g[i][left] == 'L') 
						total++;
				}
			}
		}
		System.out.println(total);
		sc.close();
	}
	static boolean in(int x, int n) {
		return x >= 0 && x < n;
	}
}
