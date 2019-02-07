import java.util.*;
public class FoodLines {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = sc.nextInt(), a[] = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int j = findIndex(a);
			System.out.println(j);
		}
		sc.close();
	}
	static int findIndex(int a[]) {
		int min = 0x3f3f3f3f;
		for(int i = 0; i < a.length; i++)
			min = Math.min(min, a[i]);
		for(int i = 0; i < a.length; i++)
			if(a[i] == min) {
				a[i]++;
				return a[i] - 1;
			}
		return -1;
	}
}
