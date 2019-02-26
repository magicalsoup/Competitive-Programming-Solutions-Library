import java.util.*;
public class dwite09c5p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 5; t++) {
			int x = sc.nextInt();
			System.out.println(find(x));
		}
		sc.close();
	}
	static int find(int x) {
		int a = 0, resa = 0, b = 0, resb = 0;
		for(int i = x - 1; i >= 1; i--) {
			if(prime(i) && a == 1) {
				resa = i;
				break;
			}
			if(prime(i)) a++;
		}
		for(int i = x + 1; ; i++) {
			if(prime(i) && b == 1) {
				resb = i;
				break;
			}
			if(prime(i)) b++;
		}
		int da = Math.abs(resa - x), db = Math.abs(resb - x);
		if(da < db) return resa;
		if(db < da) return resb;
		return Math.max(resa, resb);
	}
	static boolean prime(int n) {
		if(n <= 1) return false;
		if(n == 2) return true;
		for(int i = 2; i <= Math.sqrt(n); i++)
			if(n % i == 0) return false;
		return true;
	}
}
