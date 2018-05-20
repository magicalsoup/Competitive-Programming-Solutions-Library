package Douwei;
import java.util.Scanner;
public class CharPractice5{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int n = sc.nextInt();
	System.out.println(shift(str,n));
}
public static String shift(String str,int n) {
	String res = "";
	for(int i=0;i<str.length();i++) {
		char c = str.charAt(i);
		char d = 0;
		if(c+n>'z') {
		 d = (char)(96+((c+n-122)));
		// System.out.println((int)d);
		}
		else if(c+n>'Z'&&c+n<=100) {
			 d = (char)((64+((c+n)-90)));
		}
		else {
			 d = (char)(c+n);
		}
		res = res+d;
	}
	return res;
}
	}