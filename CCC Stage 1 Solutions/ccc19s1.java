import java.util.*;
public class ccc19s1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); int a[][] = {{1, 2}, {3, 4}};
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'H') flipH(a);
			else flipV(a);
		}
		for(int i = 0; i < 2; i++)
			System.out.println(a[i][0] + " " + a[i][1]);
		sc.close();
	}
	static void flipV(int a[][]) {
		int temp = a[0][0];
		a[0][0] = a[0][1];
		a[0][1] = temp;
		int temp2 = a[1][0];
		a[1][0] = a[1][1];
		a[1][1] = temp2;
	}
	static void flipH(int a[][]) {
		int temp = a[0][0];
		a[0][0] = a[1][0];
		a[1][0] = temp;
		int temp2 = a[0][1];
		a[0][1] = a[1][1];
		a[1][1] = temp2;
	}
}
