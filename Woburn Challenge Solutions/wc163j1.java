import java.util.Scanner;
public class wc163j1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int p = 0;
	long ans =0;
	int n = scan.nextInt();
	int m = scan.nextInt();
	int a = scan.nextInt();
	int b = scan.nextInt();
	int s = scan.nextInt();
	for(int i=0;i<m;i++) {
		int t=  scan.nextInt();
		long d = t-p-1;
		ans+=a + Math.min(d*a,s*2+d*b);
		p = t;
	}
	 long d = n-p;
	ans+= Math.min(d*a,d*b+s);
	System.out.println(ans);
	System.exit(0);
		
	}
}
