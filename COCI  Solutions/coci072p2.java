import java.util.Scanner;
public class coci072p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	if(a%2==0) {
	int t= a/2;
	int s = (t+1)*(t+1);
	System.out.println(s);
	}
	if(a%2!=0) {
		int t1 = a/2;
		int t2 = (a/2)+1;
		int s1 = (t1+1)*(t2+1);
		System.out.println(s1);
	}
	}

}
