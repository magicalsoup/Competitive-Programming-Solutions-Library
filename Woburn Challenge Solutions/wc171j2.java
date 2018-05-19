import java.util.Scanner;
public class wc171j2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double t = (a*1.8)+32;
		System.out.println(String.format("%.0f",t));
	}
}
