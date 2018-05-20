package Douwei;
import java.util.*;
public class SimpleIfPratice {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a>0&&a%2!=0) {
		System.out.println("positive odd");
	}
	else if(a>0&&a%2==0) {
			System.out.println("positive even");
	}
	else if(a<0&&a%2!=0) {
		System.out.println("negative odd");
	}
	else if(a<0&&a%2==0){
		System.out.println("negative even");
	}
	else if(a==0) {
		System.out.println("zero");
	}
}
}
