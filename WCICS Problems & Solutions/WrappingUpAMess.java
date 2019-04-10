import java.util.*;
public class WrappingUpAMess {
	static Random rng = new Random();
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double total = 0, total2 = 0;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			double l = sc.nextDouble(), w = sc.nextDouble(), h = sc.nextDouble();
			total += 2*((l*2.54)*(w*2.54)) + 2*((l*2.54)*(h*2.54)) + 2*((h*2.54)*(w*2.54));
		
			total2 += 2*(l*w) + 2*(w*h) + 2*(l*h);
		}
		System.out.println((int)(Math.ceil(total - total2)));
		sc.close();
	}
}
