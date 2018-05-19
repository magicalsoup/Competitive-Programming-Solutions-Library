import java.util.Scanner;
public class dwiteoct07p2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
			
double  a = scan.nextDouble();
double b = scan.nextDouble();
double a1= a*a;
double b2 = (1.0/3.0);
double b3 = b2*a1*b;
double t= Math.ceil(b3/1.0);
int x = (int)t;
System.out.println(x);
		
	
	}
		}
