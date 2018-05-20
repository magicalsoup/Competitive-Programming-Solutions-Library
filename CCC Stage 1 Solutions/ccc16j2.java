import java.util.Scanner;

public class ccc16j2 {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);

	double a = scan.nextDouble();
	double a1 = scan.nextDouble();
	double a2 = scan.nextDouble();
	double a3 = scan.nextDouble();
	double b = scan.nextDouble();
	double b1 = scan.nextDouble();
	double b2 = scan.nextDouble();
	double b3 = scan.nextDouble();
	double c = scan.nextDouble();
	double c1 = scan.nextDouble();
	double c2 = scan.nextDouble();
	double c3 = scan.nextDouble();
	double d = scan.nextDouble();
	double d1 = scan.nextDouble();
	double d2 = scan.nextDouble();
	double d3 = scan.nextDouble();
	
	int a4 = (int) ((int)a+a1+a2+a3);
	int b4 = (int) ((int)b+b1+b2+b3);
	int c4 = (int) ((int)c+c1+c2+c3);
	int d4 = (int) ((int)d+d1+d2+d3);
	
	int col =(int)((int)a1+b1+c1+d1);
	int col1 =(int)((int)a2+b2+c2+d2);
	int col2 =(int)((int)a3+b3+c3+d3);
	int col3 =(int)((int)a+b+c+d);
	
	if(a4==b4&&a4==c4&&a4==d4&&a4==col&&a4==col1&&a4==col2&&a4==col3) {
		System.out.println("magic");
	}
	else {
		System.out.println("not magic");
	
	}
	
	}
	
	
	
	
	}
	
