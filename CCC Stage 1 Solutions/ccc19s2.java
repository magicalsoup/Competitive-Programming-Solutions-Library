import java.util.*;
public class ccc19s2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = 2 * sc.nextInt();
			for(int i = 2; i <= x; i++) {
				if(prime(i) && prime(x - i)) {
					System.out.println(i + " " + (x - i));
					break;
				}
			}
		}
		sc.close();
	}
	static boolean prime(int n) {
		if(n <= 1) return false;
		if(n == 2) return true;
		for(int i = 2; i <= Math.sqrt(n); i++)
			if(n % i == 0) return false;
		return true;
	}
}
