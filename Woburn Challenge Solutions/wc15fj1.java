import java.util.Scanner;
public class wc15fj1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	char []a = s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(i>0) 
	System.out.print(" ");
	System.out.print(s.charAt(i));
	}
	System.out.println();
	for(int i=1;i<s.length();i++) {
		System.out.println(a[i]);
	}
	System.exit(0);
}
}
