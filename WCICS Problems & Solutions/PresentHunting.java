import java.util.*;
public class PresentHunting {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		Arrays.sort(a);
		for(int i = 0; i < m; i++) {
			int x = Arrays.binarySearch(a, sc.nextInt());
			System.out.println(x < 0 ? -1 : x);
		}
		sc.close();
	}
}
