import java.util.Scanner;
public class coci081p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count = 0;
		for(int i=1;i<c;i++) {
			if(a+i>b&&a+i<c||c-i>a&&c-i<b) {
				count++;
			}
			
		}
	System.out.println(count);
	}
}
