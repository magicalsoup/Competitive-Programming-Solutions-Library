package Douwei;
import java.util.*;
public class SumOfAllFactorsOfANumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + (num%i==0?i:0);
		}
		System.out.println(sum);
		sc.close();
	}
}
