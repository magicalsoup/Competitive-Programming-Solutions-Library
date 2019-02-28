import java.util.*;
public class GaussianElimination {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		if(n == 1 || m == 1) System.out.println("First");
		else {
			if((n + m) % 2 == 1) System.out.println("First");
			else System.out.println("Second");
		}
		sc.close();
	}
}
