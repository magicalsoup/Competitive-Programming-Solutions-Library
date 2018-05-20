package Douwei;
import java.util.*;
public class SpecialCompositeNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int n=22;n<t;n++) {
		if(getdigit(n)==factors(n))
			System.out.println(n);	
	}
}
public static boolean prime(int n) {
	if(n==1||n==0)
		return false;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
public static int getdigit(int n) {
	int sum =0;
	while(n!=0) {
		sum = sum+n%10;
		n/=10;
	}
	return sum;
}
public static int factors(int n) {
	int sum = 0;
	for(int i=1;i<n;i++) {
		if(n%i==0&&prime(i))
			sum+=getdigit(i);
	}
	return sum;
}
}
