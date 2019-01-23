import java.util.*;
public class gccsample {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			if(sc.nextInt() == 2) System.out.println("yes");
			else System.out.println("no");
		}
		sc.close();
	}
}
