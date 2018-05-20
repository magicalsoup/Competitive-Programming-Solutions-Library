import java.util.Scanner;

public class ccc05j1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

double a= scan.nextDouble();
double b= scan.nextDouble();
double c =scan.nextDouble();


if(a<250&&a<100) {
	double f6 = b*15;
	double f7 = f6/100;
	double d6 =b*35;
	double d7 = d6/100;
	double g6 =c*20;
	double g7= g6/100;
	double s6 = c*25;
	double s7 = s6/100;
	double h =f7+g7;
	double q = d7+ s7;
	double t = Math.round(h*100.0)/100.0;
	
	if(t>q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan B is cheapest.");
	System.exit(0);
	}
	if(t<q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan A is cheapest.");
	System.exit(0);
	}
	if(t==q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan A and B are the same price.");
	System.exit(0);
	}
	}


if(a<250||a>100) {
	double e6 = (a - 100);
	double e7 =(e6*25)/100;
	double f6 = b*15;
	double f7 = f6/100;
	double d6 =b*35;
	double d7 = d6/100;
	double g6 =c*20;
	double g7= g6/100;
	double s6 = c*25;
	double s7 = s6/100;
	double h =e7+f7+g7;
	double q = d7+ s7;
	double t = Math.round(h*100.0)/100.0;
	
	if(t>q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan B is cheapest.");
	System.exit(0);
	}
	if(t<q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan A is cheapest.");
	System.exit(0);
	}
	if(t==q) {
		System.out.println("Plan A costs "+t);
		System.out.println("Plan B costs "+q);
		System.out.println("Plan A and B are the same price.");
	System.exit(0);
	}
	}
	}
}