import java.util.Scanner;

public class ccc08j1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
double t = scan.nextDouble();
double m =scan.nextDouble();

if(t /(m *m) > 25) {
	System.out.print("Overweight");
}
if ((t / (m*m) >= 18.5)&&(t/(m*m)<=25)) {
	System.out.println("Normal weight");
}
if(t/ (m*m)< 18.5) {
	System.out.println("Underweight");
}
	
	
	
	
	}
}