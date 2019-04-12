import java.util.*;
public class StalinSort {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n], b[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int prev = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] < prev)
				a[i] = -1;
			else
				prev = a[i];
		}
		
		for(int i = 0; i < n; i++)
			if(a[i] != -1)
				System.out.println(a[i]);
		sc.close();
	}
}
