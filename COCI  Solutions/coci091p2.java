import java.util.Scanner;
public class coci091p2{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		for(int i=0;i<=n+1;i++) {
			 count = count +i;
		}
		System.out.println(count*n);
	}
}
