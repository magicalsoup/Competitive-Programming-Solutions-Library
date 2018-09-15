import java.util.*;
public class BestFish {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int cmax = -1;
		for(int i = 0; i < c; i++) {
			cmax = Math.max(cmax, sc.nextInt() * sc.nextInt());
		}
		int n = sc.nextInt();
		int nmax = -1;
		for(int i = 0; i < n; i++) {
			nmax = Math.max(nmax, sc.nextInt() * sc.nextInt());
		}
		System.out.println(cmax > nmax ? "Casper" : cmax == nmax? "Tie" : "Natalie");
		sc.close();
	}
}
