import java.util.*;
public class coci064p3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan  = new Scanner(System.in);
			int n = scan.nextInt();
			int a = scan.nextInt();
			for(int x =1;x<n;x++) {
				int b = scan.nextInt();
				int gcf = gcf(a,b);
				System.out.println((a/gcf)+"/"+(b/gcf));
			}
	}
	public static int gcf(int a, int b) {
		return b ==0? a: gcf(b,a%b);
	}
}
