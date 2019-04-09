import java.util.*;
public class CookiesAndChimneys {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int l[] = new int[n], w[] = new int[n], c[] = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			w[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < n; i++) {
			d += c[i];
			if(d == l[i] || d == w[i]) {
				System.out.println("Just right");
				return;
			}
			else if(d > l[i] || d > w[i]) {
				System.out.println("Less cookies");
				return;
			}
			
			
		}
		System.out.println("More cookies");
	}
}
