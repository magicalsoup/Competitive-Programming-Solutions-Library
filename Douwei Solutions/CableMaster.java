package Douwei;
import java.util.*;
public class CableMaster {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] cable = new int[n];
		int total = 0;
		for(int i = 0; i < n ; i++) {
			double d = sc.nextDouble();
			cable[i] = (int)d;
			total = total + cable[i];
		}
		int ans = (int)(total/k);
		System.out.println(ans+".00");
		sc.close();
	}
}
