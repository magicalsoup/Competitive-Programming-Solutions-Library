import java.util.*;
public class ThreeDimensionalConnect4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char g[][][] = new char[6][6][6];
		int ans = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				String s = sc.next();
				for(int k = 0; k < 6; k++) {
					g[i][j][k] = s.charAt(k);
				}
			}
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				for(int k = 0; k < 6; k++) {
					if(g[i][j][k] == 'R') {
						if(i + 3 < 6) {
							boolean same = true;
							for(int l = 1; l <= 3; l++) if(g[i + l][j][k] == 'Y') same = false;
							if(same) ans++;
						}
						if(j + 3 < 6) {
							boolean same = true;
							for(int l = 1; l <= 3; l++) if(g[i][j + l][k] == 'Y') same = false;
							if(same) ans++;
						}
						if(k + 3 < 6) {
							boolean same = true;
							for(int l = 1; l <= 3; l++) if(g[i][j][k + l] == 'Y') same = false;
							if(same) ans++;
						}
					}
				}
			}
		}
		System.out.println(ans == 0? "lost" : ans);
		sc.close();
	}
}
