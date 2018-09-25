import java.util.*;
public class LoveTriangle {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		System.out.println(Math.max(Math.max(a * b, Math.abs(a - b)), a + b));
		sc.close();
	}
}
