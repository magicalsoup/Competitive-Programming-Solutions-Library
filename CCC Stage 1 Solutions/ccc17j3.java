import java.util.*;
public class ccc17j3{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int bx = scan.nextInt();
		int by = scan.nextInt();
		int ex = scan.nextInt();
		int ey = scan.nextInt();
		int t= scan.nextInt();
		int total = Math.abs(ex-bx)+Math.abs(ey-by);
		if(total<=t) {
			if((t-total)%2==0) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
		else{
		System.out.println("N");
		}
	}
}
