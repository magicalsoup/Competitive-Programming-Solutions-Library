import java.util.Scanner;
public class avatarwater {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
int a= scan.nextInt();
int b = scan.nextInt();
int c =scan.nextInt();
if(a==b) {
	int t = (c-a);
	System.out.println(t);
}
	if(b ==c) {
		int w =(a -b);
			System.out.println(w);
		
	}
	if (c==a) {
		int x =(b -c);
		System.out.println(x);
	}
	}	
	}
