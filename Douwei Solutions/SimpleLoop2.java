package Douwei;
import java.util.*;
public class SimpleLoop2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	for(int i =1;i<=a;i++) {
		if(i%b==1&&i!=1) {
			System.out.println();
		}
		if(i%b==0||i==a)
		System.out.print(i);
		else
			System.out.print(i+" ");
	}
}
}
