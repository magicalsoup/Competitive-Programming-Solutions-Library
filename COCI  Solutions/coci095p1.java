import java.util.*;
public class coci095p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
			double a= scan.nextDouble();
			double b= scan.nextDouble();
			double c= scan.nextDouble();
			double i= scan.nextDouble();
			double j= scan.nextDouble();
			double k= scan.nextDouble();
			double a1 = a/i;
			double b1 = b/j;
			double c1 = c/k;
			if(a1<=b1&&a1<=c1) {
				a =0;
				b-= a1*j;
				c-= a1*k;
			}
			else if(b1<=a1&&b1<=c1) {
				b =0;
				a -= b1*i;
				c -= b1*k;
			}
			else {
				c=0;
				b-= c1*j;
				a -= c1*i;
			}
			System.out.printf("%6f %6f %6f",a,b,c);
	}
}
