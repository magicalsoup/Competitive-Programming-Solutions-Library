import java.util.Scanner;
public class P109EX10 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = a/25;
int c = (a%25)/10;
int d = ((a%25)%10)/5;
int e = (((a%25)%10)%5)/1;
System.out.print(a+" cents requires ");
if(b>0&&b>1) {
	System.out.print(b +" quarters, ");
	}
if(b>0&&b==1) {
	System.out.print(b +" quarter, ");
	}
if(c>0&&c>1) {
	System.out.print(c+" dimes, ");
}
if(c>0&&c==1) {
	System.out.print(c+" dime, ");
}
if(d>0&&d>1) {
	System.out.print(d+" nickels, ");
}
if(d>0&&d==1) {
	System.out.print(d+" nickel, ");
}

if(e>0&&e>1) {
	System.out.print(e+" cents.");
}
if(e>0&&e==1) {
	System.out.print(e+" cent.");
}
}
}
