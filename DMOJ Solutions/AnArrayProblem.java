import java.util.*;
public class AnArrayProblem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 0;
		long sum = 0;
		for(int i = 0; i < a; i++) {
			int x = sc.nextInt();
			max = Math.max(max, x);
			sum+=x;
		}
		System.out.println(Math.min(sum-max, sum/2));
		sc.close();
	}
}
