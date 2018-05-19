import java.util.Scanner;
public class wc163s1{
	static long cal(long c) {
		return c*(c+3)/2;
	}
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	long n = scan.nextLong();
	long m = scan.nextLong();
	long k = scan.nextLong();
	k++;
	if(k>=m+n-2) {
		System.out.println(-1);
		System.exit(0);
	}
	long inc =Math.min(k, 2*(Math.min(n,m)-1));
	long full =Math.max(k-inc,0L);
	System.out.println(cal(inc/2)+cal((inc+1)/2)+full*Math.min(n,m));
	System.exit(0);
	}
	}
