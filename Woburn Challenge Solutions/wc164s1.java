import java.util.*;
public class wc164s1{
	static int n;
	static int[] t = new int[200000],x = new int[200000],y =new int[200000];
	public static double velocity(int i,int j) {
		double d =Math.sqrt(Math.pow(x[i]-x[j], 2.0)+Math.pow(y[i]-y[j],2.0));
		return d/(t[j]-t[i]);
	}
	public static double simulate(int skip) {
		double maxv =0;
		for(int i=0;i<n-1;i++) {
			if(i==skip-1) {
				if(i+2<n) {
				maxv = Math.max(maxv, velocity(i,i+2));	
				}
			}
			else if(i!=skip) {
				maxv = Math.max(maxv, velocity(i,i+1));
			}
		}
		return maxv;
	}
public static void main(String[]args) {
	@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(int i=0;i<n;i++) {
	t[i] = sc.nextInt();
	x[i] = sc.nextInt();
	y[i] = sc.nextInt();
}
double maxv =0;
int maxi = 0;
for(int i=0;i<n-1;i++) {
	double v = velocity(i,i+1);
	if(v>maxv) {
		maxv = v;
		maxi = i;
	}
}
System.out.println(Math.min(simulate(maxi), simulate(maxi+1)));
}
}
