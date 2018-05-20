import java.util.*;
public class ccc06s2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	char[] alpha = new char[27];
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	for(int x =0;x<s1.length();x++) {
		int index = s2.charAt(x)-'A';
		if(index<0)
			index+=59;
		alpha[index] = s1.charAt(x);
	}
	String s3 = sc.nextLine();
	for(int x =0;x<s3.length();x++) {
		int index = s3.charAt(x)-'A';
		if(index<0)
			index+=59;
		if(alpha[index]=='\u0000')
		System.out.print(".");
		else
			System.out.print(alpha[index]);
	}
}
}
