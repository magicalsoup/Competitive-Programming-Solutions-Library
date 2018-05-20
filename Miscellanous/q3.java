import java.util.*;
public class q3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int dp[][] = new int[a][a];
		for(int i=0;i<a;i++) 
			for(int j =0; j<a;j++) {
				dp[i][j] = scan.nextInt();
		}
		int b = scan.nextInt();
		for(int z=0;z<b;z++) {
			int sum = 0;
			int x = scan.nextInt();
			int y = scan.nextInt();
			int count =0;
			int count2 =0;
			while(count<a) {
				sum = sum+dp[x-1][count];
				count++;
				//System.out.print(dp[x-1][count-1]+" ");
			}
			while(count2<a) {
				sum = sum+dp[count2][y-1];
				count2++;
			}
		System.out.println(sum);
		}
	}
}
