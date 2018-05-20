import java.util.*;
public class ccc12s5{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c= scan.nextInt();
		int[][] lab = new int[r+1][c+1];
		for(int i=1;i<lab.length;i++) {
			for(int j=1;j<lab[i].length;j++) {
				lab[i][j] = -1;
			}
		}
		lab[1][1]=1;
		int cats = scan.nextInt();
			for(int k =1;k<=cats;k++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				lab[x][y] =0;
			}
			for(int m=1;m<lab.length;m++) {
				for(int n=1;n<lab[m].length;n++) {
					if(m==1&&n==1)
						continue;
					if(lab[m][n]!=0)
						lab[m][n] = lab[m-1][n]+lab[m][n-1];
				}
			}
			System.out.println(lab[lab.length-1][lab[0].length-1]);
	}
}
