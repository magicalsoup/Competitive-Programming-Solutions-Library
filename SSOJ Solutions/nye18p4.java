import java.util.*;
public class nye18p4 {
	static boolean f[];
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(); f = new boolean[n + 1];
		sieve(n); long sum = 0;
		for(int i = 2; i <= n; i++)
			if(!f[i] && String.valueOf(i).contains(String.valueOf(k))) sum += i;
		System.out.println(sum);
		sc.close();
	}
	static void sieve(int n) {
		for(int i = 2; i <= n; i++) {
			if(!f[i] && (long)(i * i) <= n)
				for(long j = 2 * i; j <= n; j += i) f[(int)j] = true;
		}
	}
}
