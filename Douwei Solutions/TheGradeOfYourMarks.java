package Douwei;
import java.util.*;
public class TheGradeOfYourMarks {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a>=90&&a<=100) {
		System.out.println("A");
		System.out.println("Pass");
	}
	else if(a>=80&&a<=89) {
		System.out.println("A-");
		System.out.println("Pass");
	}
	else if(a>=70&&a<=79) {
		System.out.println("B");
		System.out.println("Pass");
	}
	else if(a>=60&&a<=69) {
		System.out.println("B-");
		System.out.println("Pass");
	}
	else if(a>=50&&a<=59) {
		System.out.println("C");
		System.out.println("Pass");
	}
	else if(a>=40&&a<=49) {
		System.out.println("C-");
		System.out.println("Pass");
	}
	else if(a>=0&&a<=39) {
		System.out.println("F");
		System.out.println("Fail");
	}
	else {
		System.out.println("invalid mark");
	}
}
}
