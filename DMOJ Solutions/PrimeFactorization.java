import java.util.*;
public class PrimeFactorization {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m-->0) {
			int x = sc.nextInt();
			for(int i = 2; i <= (int)Math.sqrt(x); i++) {
				while (x % i == 0) {
					System.out.print(i + " "); x /=i;
				}
			}
			if(x!=1) System.out.print(x);
			System.out.println();
		}
		sc.close();
	}
}
