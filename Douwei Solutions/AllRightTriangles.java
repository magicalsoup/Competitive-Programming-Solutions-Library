package Douwei;
	import java.util.*;
	public class AllRightTriangles {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=  sc.nextInt();
		for(int i=3;i<a;i++) {
			for(int j =i;j<a;j++) {
				for(int k=j;k<a;k++) {
					if(i*i+j*j==k*k&&i<=j&&j<=k) {
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
	}
