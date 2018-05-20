package Douwei;
	import java.util.*;
	public class NestLoop1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j =1;
		for(int i=1;i<=a;i++) {
			for( j=1;j<=a;j++) {
				System.out.println(i+" "+j);
			}
		}
	}
	}
