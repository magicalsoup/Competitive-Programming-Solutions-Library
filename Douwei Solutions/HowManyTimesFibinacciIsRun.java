package Douwei;
import java.util.*;
public class HowManyTimesFibinacciIsRun {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(fib(a,b));
		sc.close();
	}
	static int fib(int a, int b) {
		if(a==b)
			return 1;
		if(a==1||a==2)
			return 0;
		return fib(a-1,b) + fib(a-2,b);
	}
}
