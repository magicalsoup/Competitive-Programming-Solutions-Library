import java.util.Scanner;
public class ccc12s1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int count=0;
		for(int i=1;i<a;i++) {
			for(int j=2;j<a;j++) {
				for(int k=3;k<a;k++) {
					if(i<j&&j<k&&k<a) {
						count++;
					}
				}
			}
		}
	System.out.println(count);
	}
}
