package Douwei;
import java.util.*;
public class SimpleIfPratice2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a+b>c&&b+c>a&&c+a>b) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
