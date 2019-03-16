import java.util.*;
public class ecoo18r1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 10; t++) {
			int T = sc.nextInt(), N = sc.nextInt(), delayDays = 0;
			for(int days = 1; days <= N; days++) {
				char c = sc.next().charAt(0);
				if(c == 'B') {
					if(days > delayDays)
						delayDays = days + T - 1;
					else delayDays += T;
				}
			}
			System.out.println(Math.max(0, delayDays - N));
		}
		sc.close();
	}
}
