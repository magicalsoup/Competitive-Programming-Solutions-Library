import java.util.*;
public class ccc12j4{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	int k =  scan.nextInt();
	String a= scan.next();
	for(int i=0;i<a.length();i++) {
		int s =3*(i+1)+k;
		char c = a.charAt(i);
		int a1 = c-s;
		if(a1<65) {
			a1 =a1+26;
		}
		char n = (char)a1;
		System.out.print(n);
	}
}
}
