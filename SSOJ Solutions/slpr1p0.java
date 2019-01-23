import java.util.*;
public class slpr1p0 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			System.out.println((long)(Math.pow(sc.nextDouble(), sc.nextDouble())));
		}
		sc.close();
	}
}
