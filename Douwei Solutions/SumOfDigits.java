package Douwei;
import java.util.*;
public class SumOfDigits {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int d1 = a/1000%10;
	int d2 = a/100%10;
	int d3 = a/10%10;
	int d4 = a%10;
	System.out.println(d1+d2+d3+d4);
}
}
