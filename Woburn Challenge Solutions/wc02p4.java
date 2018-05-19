import java.util.Scanner;
public class wc02p4{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int temp=0;
		while(temp<t) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int max =0;
				for(int j=a;j<=10000;j+=b) {
						if((j-a)%c==0&&j!=a) {
							max =j;
							break;
				}
			}
				if(a!=c) {
			System.out.println(max);
				}
				else {
					System.out.println(a);
				}
			temp++;
		}
	}
}
