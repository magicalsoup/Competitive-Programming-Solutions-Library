package Douwei;
import java.util.*;
public class CountingLoop {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	for(;;) {
		int a= sc.nextInt();
		int b = sc.nextInt();
			int count =0;
			int sum =0;
		for(int i=a;i<=b;i++) {
			if(sum>b) {
				break;
			}
			else {
				sum = sum+i;
				count++;
			}
		}
		System.out.println(count);
	}
}
}
