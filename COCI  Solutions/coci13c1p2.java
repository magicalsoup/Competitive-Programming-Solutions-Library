import java.util.*;
public class coci13c1p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int ans = 0;
		while(n != 0) {
			n %= m;
			ans += n;
			m -= n;
		}
		System.out.println(ans);
		sc.close();
	}
}
