import java.util.*;
public class hc18p0 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int r = sc.nextInt(), o = sc.nextInt();
			double arc = 2 * Math.PI * r * o / 360.0;
			System.out.printf("%.2f\n", arc);
		}
		sc.close();
	}
}
