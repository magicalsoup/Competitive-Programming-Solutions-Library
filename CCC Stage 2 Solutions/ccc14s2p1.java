import java.util.*;
public class ccc14s2p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		scan.nextLine();
		int count =0;
		boolean[][] full = new boolean[n][n];
		int[][]troys = new int[n][n];
		for(int i=n-1;i>=0;i--) {
			String s= scan.nextLine();
			for(int j=0;j<n;j++)
				full[i][j] = s.charAt(j)=='#';
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(full[i][j])
				{
					if(i!=0&&j!=0&&j!=n-1)
						troys[i][j] += Math.min(troys[i-1][j-1],Math.min(troys[i-1][j],troys[i-1][j+1]))+1;
					else
						troys[i][j] = 1;
					count+= troys[i][j];
				}
		System.out.println(count);
	}
}
