import java.util.*;
public class AMaxProblem {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); long a[] = new long[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		
		long max = Long.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				long d = a[i] * a[j];
				max = Math.max(max, d);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
