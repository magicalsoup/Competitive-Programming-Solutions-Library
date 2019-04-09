import java.util.*;
public class PresentSorting {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); Integer a[] = new Integer[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for(int i : a)
			System.out.println(i);
		sc.close();
	}
}
