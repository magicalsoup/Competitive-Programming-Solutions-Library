import java.util.*;
public class wc96p1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	for(int lol = 0;lol<5;lol++) {
		int n = sc.nextInt();
		boolean[][][] fishtank = new boolean[n][n][n];
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int t = sc.nextInt();
			int b = sc.nextInt();
			if(x==0&&y==0&&t==0&&b==0)
				break;
			for(int level= b-1;level<t;level++) {
				fishtank[x-1][y-1][level] = true;
			}
		}
		int max = -1;
		int maxlevel = -1;
		for(int i=0;i<n;i++) {
			int count =0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(fishtank[j][k][i]) {
						count++;
					}
				}
			}
			if(count>max) {
				max = count;
				maxlevel = i;
			}
		}
		System.out.println(maxlevel+1);
	}
}
}
