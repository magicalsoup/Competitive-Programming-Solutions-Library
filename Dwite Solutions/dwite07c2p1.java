import java.util.*;
public class dwite07c2p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 5; t++) {
			int x = sc.nextInt();
			if(semiprime(x)) System.out.println("semiprime");
			else System.out.println("not");
		}
		sc.close();
	}
	static boolean semiprime(int x) {
		for(int i = 2; i <= Math.sqrt(x); i++)
			if(x % i == 0 && prime(i) && prime(x / i))
				return true;
		return false;
	}
	static boolean prime(int n) {
		if(n <= 1) return false;
		if(n == 2) return true;
		for(int i = 2; i <= Math.sqrt(n); i++)
			if(n % i == 0) return false;
		return true;
	}
}
