import java.util.Scanner;
public class wc15fs1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s[] = new String[100005];
		int ans =0;
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<m;i++) {
			s[i] = scan.nextLine();
		}
		for(int i=1;i<=15;i++) {
			boolean good = true;
			for(int j=0;good&&j<m;j++) {
				if((i+j)%15==0) {
					good &=(s[j].equals("fizzbuzz"));
				}
				else if((i+j)%3==0) {
					good &=(s[j].equals("fizz"));
				}
				else if((i+j)%5==0) {
					good &= (s[j].equals("buzz"));
				}
				else {
					good &=(s[j].equals("ook"));
				}
			}
		if(good) {
			ans+=(n-m-i+16)/15;
		}
		}
		System.out.println(ans);
		System.exit(0);
	}
}
