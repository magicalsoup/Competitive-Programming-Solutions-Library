
import java.util.Scanner;

public class p79ex5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		 Scanner scan = new Scanner(System.in);

	int t = scan.nextInt();
	int k =scan.nextInt();
	
	if ( t % k == 0) {
		System.out.println("yes");
	}
	else 
		System.out.println("no");
	}
	}

