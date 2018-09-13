package Douwei;
import java.util.*;
public class RaucousRockers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int numsongs = sc.nextInt();
		int cdlength = sc.nextInt();
		int numcds = sc.nextInt();
		int best = Integer.MIN_VALUE;
		int lengths[] = new int[25];
		int dp[][][] = new int[25][25][25];
		for(int i = 1; i <= numsongs; i++)
			lengths[i] = sc.nextInt();
		for(int a = 0; a < numcds; a++)  //current cd
			for(int b = 0; b <= cdlength; b++) // number of minutes used
				for(int c = 0; c <= numsongs; c++) { // last song
					for(int d = c+1; d <= numsongs; d++) { // new song
						if(b + lengths[d] <= cdlength)
							dp[a][b+lengths[d]][d] = Math.max(dp[a][b+lengths[d]][d], dp[a][b][c]+1);
						else {
							dp[a+1][lengths[d]][d] = Math.max(dp[a+1][lengths[d]][d], dp[a][b][c]+1);
						}
					}
					best = Math.max(best, dp[a][b][c]);
				}
		System.out.println(best);
		sc.close();
	}
}
