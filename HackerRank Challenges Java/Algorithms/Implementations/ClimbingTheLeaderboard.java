import java.util.*;
import java.util.stream.*;
public class ClimbingTheLeaderboard {
	
	static void climbingLeaderboard(int[] scores, int[] alice) {
		int arr[] = IntStream.of(scores).distinct().toArray();
		int i = arr.length-1;
		for(int score : alice) {
			while(i>=0) {
			if(score>=arr[i])
				i--;
			else {
				System.out.println(i+2);
				break;
				}
			}
			if(i<0)
				System.out.println(1);
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for(int i=0;i<n;i++)
			scores[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] alice = new int[m];
		for(int i=0;i<m;i++)
			alice[i] = sc.nextInt();
		climbingLeaderboard(scores,alice);
		sc.close();
	}
	
}
