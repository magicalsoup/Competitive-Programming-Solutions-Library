package Douwei;
import java.util.*;
public class VowelPalindromes {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	for(;;) {
		String str = sc.nextLine();
		String ans = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='Y') {
				ans+=c;
			}
		}
		if(palindrome(ans))
			System.out.println(ans+" IS PALINDROME");
		else
			System.out.println(ans+" IS NOT A PALINDROME");
	}
}
public static boolean palindrome(String str) {
	String ans = "";
	for(int i = str.length()-1;i>=0;i--) {
		ans+=str.charAt(i);
	}
	if(str.equals(ans))
		return true;
	else
		return false;
}
}
