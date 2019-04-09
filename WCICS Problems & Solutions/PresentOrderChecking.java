import java.util.*;
public class PresentOrderChecking {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), f = sc.nextInt();
		for(int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if(x <= f) {
				System.out.println("False");
				sc.close();
				return;
			}
			else {
				f = x;
			}
		}
		System.out.println("True");
		sc.close();
	}
}
