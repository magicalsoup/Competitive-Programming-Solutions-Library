import java.util.Scanner;

public class coci083p1 {
	public static void main (String[] args) {
	    @SuppressWarnings("resource")
    	Scanner scan = new Scanner(System.in);
int a= scan.nextInt();
int a1= scan.nextInt();
int a2= scan.nextInt();
int a3= scan.nextInt();
int b= scan.nextInt();
int b1= scan.nextInt();
int b2= scan.nextInt();
int b3= scan.nextInt();
int c= scan.nextInt();
int c1= scan.nextInt();
int c2= scan.nextInt();
int c3= scan.nextInt();
int d= scan.nextInt();
int d1= scan.nextInt();
int d2= scan.nextInt();
int d3= scan.nextInt();
int e= scan.nextInt();
int e1= scan.nextInt();
int e2= scan.nextInt();
int e3= scan.nextInt();
	
	int a4= a+a1+a2+a3;
	int b4= b+b1+b2+b3;
	int c4= c+c1+c2+c3;
	int d4= d+d1+d2+d3;
	int e4= e+ e1+e2+e3;
	
	
	if(a4>b4&&a4>c4&&a4>d4&&a4>e4) {
		System.out.println("1 "+a4);
	}
	
	if(b4>a4&&b4>c4&&b4>d4&&b4>e4) {
		System.out.println("2 "+b4);
	}
	
	if(c4>b4&&c4>a4&&c4>d4&&c4>e4) {
		System.out.println("3 "+c4);
	}
	
	if(d4>b4&&d4>c4&&d4>a4&&d4>e4) {
		System.out.println("4 "+d4);
	}
	
	if(e4>b4&&e4>c4&&e4>d4&&e4>a4) {
		System.out.println("5 "+e4);
	}
	
	
	
	
	}
	}
