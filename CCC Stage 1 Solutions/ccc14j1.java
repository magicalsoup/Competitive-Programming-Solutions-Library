import java.util.Scanner;

public class ccc14j1{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
int a =scan.nextInt();
int b =scan.nextInt();
int c =scan.nextInt();
if(a + b+ c != 180) {
	System.out.println("Error");
}
else if(a ==b && b==c && c==a&&a+b+c==180) {
	System.out.print("Equilateral");
}
	else if((a ==b && c!=a&&c!=b)|| (b ==c&& a!=b&& a!=c)||(c ==a&& b!=a&&b!=c&&a+b+c==180)){
		System.out.println("Isosceles");
	}
	else if (a!=b && b != c&& c!=a&&a+b+c==180 ) {
		System.out.print("Scalene");
	}
	

	
	
	
	}
	}
