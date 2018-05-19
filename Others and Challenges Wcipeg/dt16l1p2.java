import java.util.Scanner;
public class dt16l1p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		while(true) {
			n=n/10;
			count++;
			if(n==0) {
				break;
			}
		}
		if(count==1||count==2||count==3||count==5) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
