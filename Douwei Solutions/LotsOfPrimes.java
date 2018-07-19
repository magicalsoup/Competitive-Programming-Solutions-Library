package Douwei;
import java.util.Scanner;
public class LotsOfPrimes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=n;i<=m;i++) {
			if(PRIME(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	public static boolean PRIME(int n) {
		if(n<2)
			return false;
		if(n==2)
			return true;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
}
