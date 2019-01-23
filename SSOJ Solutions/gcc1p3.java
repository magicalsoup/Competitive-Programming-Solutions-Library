import java.util.*;
public class gcc1p3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); double r= 0, l = 0;
		for(int i = 0; i < n; i++) { r += sc.nextDouble(); l += sc.nextDouble();}
		System.out.printf("%.2f %.2f\n", r / n, l / n);
		sc.close();
	}
}
