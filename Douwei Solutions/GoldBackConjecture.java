package Douwei;
import java.util.*;
public class GoldBackConjecture {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i=2;i<=a;i++) {
		for(int j = i;j<=a;j++) {
			if(prime(i)&&prime(j)&&i+j==a) {
				System.out.println(i+"+"+j);
			}
		}
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
