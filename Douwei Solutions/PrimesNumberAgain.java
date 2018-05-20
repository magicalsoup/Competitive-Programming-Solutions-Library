package Douwei;
import java.util.*;
public class PrimesNumberAgain {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	for(;;) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count =0;
		for(int i=a;i<=b;i++) {
			if(prime(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
public static boolean prime(int n) {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
