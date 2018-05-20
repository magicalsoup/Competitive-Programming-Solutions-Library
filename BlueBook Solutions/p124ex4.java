import java.util.Scanner;
public class p124ex4 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
	double a = scan.nextDouble();
	a = a/100;
	long b = scan.nextLong();
	double c = scan.nextDouble();
	long d = scan.nextLong();

	

	
for(int i=0;i<d-b;i++) {
	c = (c*a)+c;
	
}

System.out.println(Math.round(c));


	
		}
}
