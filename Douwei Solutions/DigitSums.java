package Douwei;
import java.util.*;
public class DigitSums {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println(res(a));
}
public static int res(int n) {
	int sum = 0;
	while(n!=0) {
		sum= sum+n%10;
	n/=10;
	}
	return sum;
}
}
