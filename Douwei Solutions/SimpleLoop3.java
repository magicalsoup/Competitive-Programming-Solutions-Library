package Douwei;
	import java.util.Scanner;
	public class SimpleLoop3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c= sc.nextInt();
		int b = sc.nextInt();
		for(int i =a;i>=0;i-=c) {
			if(i%b==0&&i!=a) {
				System.out.println();
			}
			if(i%b==c||i==0||i==1)
			System.out.print(i);
			else
				System.out.print(i+" ");
		}
	}
	}
