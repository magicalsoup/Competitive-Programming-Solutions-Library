import java.util.Scanner;

public class ccc12j2{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c =scan.nextInt();
		int d =scan.nextInt();
		
		if (a ==b&&b==c&&c==d&&d==a) {
			System.out.println("Fish At Constant Depth");
		System.exit(0);
		}
	if(a<b&&b<c&&c<d) {
		System.out.println("Fish Rising");
	System.exit(0);
	}
	
	if(a>b&&b>c&&c>d) {
		System.out.println("Fish Diving");
	System.exit(0);
	}
	
	
	else {
		System.out.println("No Fish");
	}

	}
}