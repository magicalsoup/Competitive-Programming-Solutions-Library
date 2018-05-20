import java.util.*;
public class ccc11s3{
public static boolean check(double a, double x, double y,double xx,double yy) {
	if(a==0)
		return false;
	if(xx+Math.pow(5,a-1)<=x) {
		if(x<xx+4*Math.pow(5,a-1)) {
			if(y<yy+Math.pow(5, a-1)) {
				return true;
			}
		}
	}
	if(xx+2*Math.pow(5,a-1)<=x) {
		if(x<xx+3*Math.pow(5, a-1)) {
			if(y<yy+2*Math.pow(5,a-1)) {
				if(yy+Math.pow(5, a-1)<=y) {
					return true;
				}
			}
		}
	}
	if(check(a-1,x,y,xx+Math.pow(5, a-1),yy+Math.pow(5, a-1))) {
		return true;
	}
	if(check(a-1,x,y,xx+2*Math.pow(5, a-1),yy+2*Math.pow(5, a-1))) {
		return true;
	}
	if(check(a-1,x,y,xx+3*Math.pow(5, a-1),yy+Math.pow(5, a-1))) {
		return true;
	}
	return false;
}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int test = sc.nextInt();
	for(int i=0;i<test;i++) {
		if(check(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),0.0,0.0)) {
			System.out.println("crystal");
		}
		else {
			System.out.println("empty");
		}
	}
}
}
