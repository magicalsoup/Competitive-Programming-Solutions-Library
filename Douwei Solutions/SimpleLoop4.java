package Douwei;
import java.util.*;
public class SimpleLoop4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	for(int i=a;i>=-a;i-=5) {
		if(i!=-a)
		System.out.print(i+" ");
		else
			System.out.print(i);
	}
}
}
