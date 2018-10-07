import java.util.*;
public class SixteenBitsOnly {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a-->0) {
			System.out.println(sc.nextLong() * sc.nextLong() == sc.nextLong() ? "POSSIBLE DOUBLE SIGMA" : "16 BIT S/W ONLY");
		}
		sc.close();
	}
}
