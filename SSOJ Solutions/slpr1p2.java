import java.util.*;
public class slpr1p2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		while(n-- > 0) sum += sc.nextInt();
		System.out.printf("%s\n%s", t - sum == 0? "Zero": t - sum > 0? "Surplus" : "Deficit", t - sum);
		sc.close();
	}
}
