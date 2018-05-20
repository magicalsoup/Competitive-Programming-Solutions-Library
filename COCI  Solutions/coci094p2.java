import java.util.Scanner;
public class coci094p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b =2;
		double c =0;
		for(int i=0;i<a;i++) {
			b = b*2-1;
			 c =Math.pow(b, 2);
		}
		int t = (int)c;
		System.out.println(t);
	}

}
