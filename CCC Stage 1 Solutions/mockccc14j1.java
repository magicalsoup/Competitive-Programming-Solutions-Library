import java.util.Scanner;

public class mockccc14j1{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double a = scan.nextInt();
	double b = scan.nextInt();
	int r = scan.nextInt();
	
	if(a > r) {
		System.out.println("Bob overdoses on day 1.");
	System.exit(0);
	}
	else if((a * 0.5) + b > r) {
		System.out.println("Bob overdoses on day 2.");
	System.exit(0);
		
	}
	System.out.println("Bob never overdoses.");
	}
}



