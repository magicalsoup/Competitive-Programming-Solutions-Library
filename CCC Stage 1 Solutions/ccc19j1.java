import java.util.*;
public class ccc19j1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt(), b = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		if(a > b) System.out.println("A");
		if(b > a) System.out.println("B");
		if(a == b) System.out.println("T");
		sc.close();
	}
}
