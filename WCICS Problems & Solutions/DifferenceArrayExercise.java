import java.util.*;
public class DifferenceArrayExercise {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		long dif[] = new long[n + 1], a[] = new long[n + 1];
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		
		dif[0] = a[0]; dif[n] = 0;
		for(int i = 1; i < n; i++)
			dif[i] = a[i] - a[i-1];
		
		for(int i = 0; i < q; i++) 
			update(dif, sc.nextInt()-1, sc.nextInt()-1, sc.nextLong());
		
		a[0] = dif[0];
		System.out.print(a[0] + " ");
		for(int i = 1; i < n; i++) {
			a[i] = dif[i] + a[i - 1];
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
	static void update(long dif[], int l, int r, long x) {
		dif[l] += x;
		dif[r + 1] -= x;
	}
}
