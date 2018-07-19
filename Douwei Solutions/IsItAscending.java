package Douwei;
import java.util.*;
public class IsItAscending {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int curr = -1;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(num>curr) {
				curr = num;
				continue;
			}
			else {
				System.out.println("NO");
				return;
			}
		}
			System.out.println("YES");
		sc.close();
	}
}
