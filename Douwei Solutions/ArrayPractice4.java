package Douwei;
import java.util.*;
public class ArrayPractice4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	double arr[] = new double[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextDouble();
	}
	int t = sc.nextInt();
	double clos = Double.MAX_VALUE;
	double ans =0;
	for(int i=0;i<a;i++) {
		double dif =0;
		if(arr[i]<t) {
			dif = t-arr[i];
		}
		else {
			dif = arr[i]-t;
		}
		if(dif<clos) {
			clos = dif;
			ans = arr[i];
		}
	}
	System.out.println(String.format("%.2f",ans));
}
}
