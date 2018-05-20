import java.util.Scanner;

public class coci075p1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

	int a =scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	
	if(a+b==c) {
		System.out.println(a+"+"+b+"="+c);
	}
	if(a==b+c) {
		System.out.println(a+"="+b+"+"+c);
	}
	if(a-b==c) {
		System.out.println(a+"-"+b+"="+c);
	}
	if(a==b-c) {
		System.out.println(a+"="+b+"-"+c);
	}		
if(a*b==c) {
	System.out.println(a+"*"+b+"="+c);
}

if(a==b*c){
	System.out.println(a+"="+b+"*"+c);
}
if(a/b==c) {
	System.out.println(a+"/"+b+"="+c);

}
	if(a==b/c) {
		
		System.out.println(a+"="+b+"/"+c);
	}
	
	}
	}
