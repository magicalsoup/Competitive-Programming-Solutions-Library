package Douwei;
import java.util.*;
public class Factorials {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	long sum =1;
	for(int i=1;i<=a;i++) {
		sum*=i;
	}
	System.out.println(sum);
}
}
