import java.util.*;
public class wc99p3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	double max = 0;
	while(max!=-1) {
		max = sc.nextDouble();
		final int MAX = 100000;
		double ret =0;
		for(int i=0;i<MAX;i++) {
			double x = (0.5+i)/MAX*max;
			double y = Math.exp(-x*x);
			ret+=y/(MAX)*max;
		}
		System.out.printf("%.2f\n",ret);
	}
}
public static boolean prime(int n) {
	if(n<=1)
		return false;
	if(n==2)
		return true;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
}
