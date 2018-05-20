import java.util.Scanner;
public class avatarearth{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		int x1 = scan.nextInt();
		int y = scan.nextInt();
		int y1 = scan.nextInt();
		if((x<a&&y>a)&&(x1<b&&y1>b)) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
