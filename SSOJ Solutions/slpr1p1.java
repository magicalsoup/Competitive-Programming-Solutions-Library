import java.util.*;
public class slpr1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(), r = sc.nextInt(); double sum = 0;
		for(int i = 1; i <= n; i++) sum += k * Math.pow((1 + r / 100.0), n - i);
		System.out.printf("%.2f\n", sum);
		sc.close();
	}
}
