import java.util.Scanner;

public class ccc06j1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	int  a =scan.nextInt();
	int b = scan.nextInt();
	int c =scan.nextInt();
	int d =scan.nextInt();
	if( a == 1) {
		a =461;
	}
		if(a == 2) {
			a = 431;
		}
	if ( a ==3) {
		a =420;
	}
	if(a==4) {
		a =0;
	}
	
	
		
	if (b ==1) {
		b =100;
	}
		if( b ==2) {
			b =57;
		}
		if(b == 3) {
			b =70;
		}
	if(b ==4) {
		b= 0;
	}
	if(c ==1) {
		c= 130;
	}
	
	if(c ==2) {
		c =160;
	}
	if (c==3) {
		c=118;
	}
	if(c==4) {
		c=0;
	}
	if(d==1) {
		d=167;
	}
	
	if(d==2) {
		d=266;
	}
	if(d==3) {
		d=75;
	}
	if(d==4) {
		d=0;
	}
	
	int t = a+b+c+d;
	
	System.out.println("Your total Calorie count is "+t+".");
	
	}
}
