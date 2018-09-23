import java.util.*;
public class MimiAndPrimes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long gcd = sc.nextLong();
		for(int i = 1; i < n; i++) {
			a[i] = sc.nextLong();
			gcd = GCD(gcd, a[i]);
		}
		long ans = 1;
		for(int i = 2; i <= Math.sqrt(gcd);i++) {
			if(gcd % i == 0 ) ans = Math.max(ans, i);
			while ( gcd % i ==0 ) gcd /=i;
		}
		ans = Math.max(ans, gcd);
		System.out.println(ans== 1 ? "DNE" : ans);
		sc.close();
	}
	static long GCD(long a, long b) {
		if(b == 0)
			return a;
		return GCD(b, a % b);
	}
}
