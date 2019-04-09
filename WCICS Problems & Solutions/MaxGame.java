import java.util.*;
public class MaxGame {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n], b[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			int x = sc.nextInt();
			a[i] = x;
			b[i] = x;
		}
		
		Arrays.sort(b);
		int max = b[n - 1];
		int max2 = b[n - 2];
		for(int i = 0; i < n; i++) {
			if(a[i] == max) {
				System.out.println(max2);
			}
			else {
				System.out.println(max);
			}
		}
		sc.close();
	}
}
