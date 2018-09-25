import java.util.*;
public class GiantCookie {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if( n % m ==0)
			System.out.println("yes " + n / m);
		else {
			for(int i = 1; i <= n; i++) {
				if(n % (i + m) == 0) {
					System.out.println("no " + i);
					break;
				}
			}
		}
		sc.close();
	}
}
