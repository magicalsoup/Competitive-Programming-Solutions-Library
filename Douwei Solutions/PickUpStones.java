package Douwei;
import java.util.*;
public class PickUpStones {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int n = sc.nextInt();
			System.out.println(n % 7 == 0 || n % 7 ==2 ? "NO" : "YES");
		}
		sc.close();
	}
}
