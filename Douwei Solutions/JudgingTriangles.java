package Douwei;
import java.util.*;
public class JudgingTriangles {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a*a+b*b>c*c) {
		System.out.println("acute triangle");
	}
	else if(a*a+b*b<c*c) {
		System.out.println("obtuse triangle");
	}
	else {
		System.out.println("right triangle");
	}
}
}
