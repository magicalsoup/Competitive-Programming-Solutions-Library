package Douwei;
import java.util.*;
public class MostFactors {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a  =sc.nextInt();
	int max =0;
	int num =0;
	for(int i=1;i<=a;i++) {
		if(factors(i)>max) {
			max = factors(i);
			num = i;
		}
	}
	System.out.println(num);
}
public static int factors(int n) {
	int count =0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	return count;
}
}
