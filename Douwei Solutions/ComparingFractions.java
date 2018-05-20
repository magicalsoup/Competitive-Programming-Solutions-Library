package Douwei;
import java.util.Scanner;
public class ComparingFractions{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
double a =  sc.nextInt();
double b = sc.nextInt();
double c = sc.nextInt();
double d = sc.nextInt();
if(a/b==c/d)
	System.out.println("x=y");
else if(a/b>c/d)
	System.out.println("x>y");
else
	System.out.println("x<y");
}
}
