import java.util.Scanner;
public class coci093p1{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	
	String a = scan.next();
	String b = scan.next();
	
	String reverse1 = new StringBuffer(a).reverse().toString();

	String reverse2 = new StringBuffer(b).reverse().toString();
	
	int c = Integer.valueOf(reverse1);
	int d = Integer.valueOf(reverse2);
	
	if(c > d) {
		System.out.println(reverse1);
	}
	else {
		System.out.println(reverse2);
	}

	}
}
