import java.util.*;
public class hc18p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), mx = sc.nextInt(), my = sc.nextInt(); long max = 0;
		for(int i = 0; i < n; i++) {
			max = (long)Math.max(max, Math.abs(dist(mx, my, sc.nextLong(), sc.nextLong()) - sc.nextLong()));
		}
		System.out.println(max);
		sc.close();
	}
	static long dist(long x1, long y1, long x2, long y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);	
	}
}
