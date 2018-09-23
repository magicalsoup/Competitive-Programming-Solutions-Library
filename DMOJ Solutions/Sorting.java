import java.util.*;
public class Sorting {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		a[1] = sc.nextInt();
		int m1 = 0;
		int m2 = Integer.MAX_VALUE;
		for(int i = 2; i <= n; i++) {
			a[i] = sc.nextInt();
			if(a[i-1] == 0 && a[i] == 0) continue;
			else if(a[i-1] == 0 && a[i] != 0) m2 = Math.min(m2, a[i]);
			else if(a[i-1] != 0 && a[i] ==0) m1 = Math.max(m1, a[i-1]);
			else if(a[i-1] > a[i]) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		System.out.println(m1 <= m2? "YES" : "NO");
		sc.close();
	}
}
