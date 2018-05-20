package Douwei;
import java.util.*;
public class SimpleEquations {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n-->0) {
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		boolean flag = false;
		main:for(int i=-1*(int)(Math.sqrt(c));i<=Math.sqrt(c);i++) {
			for(int j=-1*(int)(Math.sqrt(c));j<Math.sqrt(c);j++) {
				int k = a-i-j;
				if(i==j||j==k||k==i)continue;
				if(i*j*k==b&&i*i+j*j+k*k==c) {
					flag = true;
					System.out.printf("%d %d %d\n", i,j,k);
					break main;
				}
			}
		}
			if(!flag)
				System.out.printf("No solution.\n");
		
	}
}
}
