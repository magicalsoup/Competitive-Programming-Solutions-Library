import java.util.*;
public class nccc6j1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		if(a > b) System.out.println("CS452");
		if(b > a) System.out.println("PHIL145");
		sc.close();
	}
}
