import java.util.*;
public class Staircase {

	static void staircase(int n) {
		for(int i=1;i<=n;i++) {
			for(int k =n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j =0;j<i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		staircase(n);
		sc.close();
	}
}