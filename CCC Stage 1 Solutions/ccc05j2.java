import java.util.Scanner;
public class ccc05j2{
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	
	
	int a =scan.nextInt();
	int b = scan.nextInt();
	int count =0;
	for(int i=a;i<=b;i++) {
		if(rsa(i)) {
			count++;
		}
	}
	
		

	System.out.println("The number of RSA numbers between "+a+" and "+b+" is "+count);
	}
	
	
	static boolean rsa(int n) {
		int f = 0;
		for(int t =1;t<=n;t++) {
			if(n%t==0) {
				f = f+1;
			}
		}
		if(f==4) {
			return true;
		}
		return false;
	}
	
	
}