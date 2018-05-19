import java.util.Scanner;

public class wc153j1{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

int a = scan.nextInt();	
int b = scan.nextInt();	
int c = scan.nextInt();	
int d = scan.nextInt();	

	
	if(a>d&&b>c) {
		System.out.println("Batman");
	System.exit(0);
	}
	if(a<d&&b<c) {
		System.out.println("Superman");
	System.exit(0);
	}
	else
		System.out.println("Inconclusive");
	}
	}
