import java.util.Scanner;

public class coci097p1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
			if(b-45>0) {
			int b1 = b -45;
			System.out.println(a+" "+b1);
			System.exit(0);
		}
		
		if(a - 1 < 0) {
			a = 23;
			b = (60-45)+b;
			System.out.println(a+" "+b);
			System.exit(0);;
		}
		
		if((b-45)<0) {
			a = a -1;
			b = (60 -45)+b;
			
			System.out.println(a+" "+b);
			System.exit(0);
		}
	}
}
