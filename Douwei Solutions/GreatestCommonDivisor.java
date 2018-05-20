package Douwei;
import java.util.*;
public class GreatestCommonDivisor {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int maxnum =0;
	for(int i=1;i<=Math.min(a, b);i++) {
		if(a%i==0&&b%i==0) {
			if(i>maxnum) {
				maxnum = i;
			}
		}
	}
	System.out.println(maxnum);
}
}
