import java.util.*;
public class ioi0914{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int col = sc.nextInt();
	int DP[][][][] = new int[row+1][col+1][row+1][col+1];
	int Box[][] = new int[row+1][col+1];
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=col;j++) {
			DP[i][j][i][j] =0;
			Box[i][j] = sc.nextInt()+Box[i-1][j]+Box[i][j-1]-Box[i-1][j-1];
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			if(i==0&&j==0) {
				continue;
			}
			else {
				for(int k=1;k<=row-i;k++) {
					for(int l =1;l<=col-j;l++) {
						int min = Integer.MAX_VALUE;
						for(int m=k;m<k+i;m++) {
							min = Math.min(min, DP[k][l][m][l+j]+DP[m+1][l][k+i][l+j]);
						}
						for(int m=l;m<l+j;m++) {
							min = Math.min(min, DP[k][l][k+i][m]+DP[k][m+1][k+i][l+j]);
						}
						DP[k][l][k+i][l+j] = min+Box[k-1][l-1]+Box[k+i][l+j]-Box[k+i][l-1]-Box[k-1][l+j];
					}
				}
			}
		}
	}
	System.out.println(DP[1][1][row][col]);
}
}
