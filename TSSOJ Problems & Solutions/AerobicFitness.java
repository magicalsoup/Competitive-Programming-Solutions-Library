import java.util.*;
public class AerobicFitness {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble(), t = sc.nextDouble() * 60;
		System.out.printf("%.2f meters/per second\n", d / t);
		sc.close();
	}
}
