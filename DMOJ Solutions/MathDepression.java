import java.util.Scanner;
public class MathDepression {
	public static final long MOD = 1000000007;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = f(n);
		System.out.println(ans);
		sc.close();
	}
	static long f(int x) {
		long ans = 1;
		while( x > 4) {
			x -= 3;
			ans *= 3;
			ans %= MOD;
		}
		ans *= x;
		ans %= MOD;
		return ans;
	}
}
