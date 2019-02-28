import java.util.*;
public class ccc19j2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = sc.nextInt(); char s = sc.next().charAt(0);
			for(int i = 0; i < x; i++) System.out.print(s);
			System.out.println();
		}
		sc.close();
	}
}
