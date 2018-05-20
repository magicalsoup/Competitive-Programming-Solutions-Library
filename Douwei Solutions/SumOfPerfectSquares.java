package Douwei;
import java.util.*;
public class SumOfPerfectSquares {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i =0;i<a;i++) {
		int n = sc.nextInt();
		int b = sc.nextInt();
		int sum = (sum(n,b));
		System.out.println("Case "+(i+1)+": "+sum);
	}
}
public static int sum(int a, int b) {
	int count =0;
	for(int i=1;i<=b;i++) {
		if(i*i>=a&&i*i<=b)
			count = count+i*i;
	}
	return count;
}
}
