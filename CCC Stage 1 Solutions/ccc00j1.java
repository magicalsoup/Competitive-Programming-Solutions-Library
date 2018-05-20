import java.util.Scanner;
public class ccc00j1{
public static void main(String[]agrs) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println("Sun Mon Tue Wed Thr Fri Sat");
	for(int c=(4*(a-1))+2;c>2;c--) {
		System.out.print(" ");
	}
	for(int c=1;c<=b;c++,a++) {
		if(a==8) {
			System.out.println();
			a = 1;
		}
		if(c<=9) {
			System.out.print("  "+c);
		}
		else {
			System.out.print(" "+c);
		}
		System.out.print(" ");
	}
	}
}
