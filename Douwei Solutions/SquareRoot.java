package Douwei;
import java.util.*;
public class SquareRoot {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	for(int i=0;i<a;i++) {
		int num = sc.nextInt();
		double ans = Math.sqrt(num);
		if(b==1) {
			System.out.println(String.format("%.1f",ans ));
		}
		if(b==2) {
			System.out.println(String.format("%.2f",ans ));
		}
		if(b==3) {
			System.out.println(String.format("%.3f",ans ));
		}
		if(b==4) {
			System.out.println(String.format("%.4f",ans ));
		}
		if(b==5) {
			System.out.println(String.format("%.5f",ans ));
		}
		if(b==6) {
			System.out.println(String.format("%.6f",ans ));
		}
		if(b==7) {
			System.out.println(String.format("%.7f",ans ));
		}
		if(b==8) {
			System.out.println(String.format("%.8f",ans ));
		}
		if(b==9) {
			System.out.println(String.format("%.9f",ans ));
		}
		if(b==10) {
			System.out.println(String.format("%.10f",ans ));
		}
	}
}
}
