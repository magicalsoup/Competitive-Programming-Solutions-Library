import java.util.*;
public class SAOJ {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long mod = (long) 1e9;
		int n = sc.nextInt();
		long ans = 0;
		for(long i = 1; i <= n; i++)
			ans = (ans + i * i % mod * i % mod * i % mod * i % mod * i % mod) % mod;
		System.out.println(ans);
		sc.close();
	}
}
