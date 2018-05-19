import java.util.Scanner;

public class dt16l1p1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
String s1 = scan.nextLine(); 
//System.out.println("a is " + a);
int a = Integer.parseInt(s1);
String b = scan.nextLine();
//System.out.println("Operation is " + b);
String s3 = scan.nextLine();
int c = Integer.parseInt(s3);



//int i = scan.nextInt();

int d = 0;
//  ( i = 0; i < 10000 ; i++)
if ((b).equals("#")) {
//	int d;
	d = (a * c)*(c -14);
}
if ((b).equals("@")) {
	d = (c*a)/(2*a -3 );
}
if ((b).equals("$")) {
	d = (a*a) - (c*c);
}
	
	System.out.println("The equation " + a + " " + b + " " + c + " is equal to " + d + "."); 
	//System.out.print(d);
		
	
	}
}
