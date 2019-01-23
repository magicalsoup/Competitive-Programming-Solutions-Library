import java.util.*;
public class gcc1p4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int x = sc.nextInt();
			if(x % 2 != 0) System.out.println(x * 2 - 1);
			else System.out.println(x);
		}
		sc.close();
		
	}
}
