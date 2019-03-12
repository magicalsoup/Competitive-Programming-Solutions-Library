import java.util.*;
public class ecoo17r1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 10; t++) {
			int cost = sc.nextInt();
			double y1 = sc.nextDouble(), y2 = sc.nextDouble(), y3 = sc.nextDouble(), y4 = sc.nextDouble();
			int n = sc.nextInt();
			double a = y1 * n * 12, b = y2 * n * 10, c = y3 * n * 7, d = y4 * n * 5;
			double sum = (a + b + c + d) / 2;
			System.out.println(sum >= cost? "NO": "YES");
		}
		sc.close();
	}
}
