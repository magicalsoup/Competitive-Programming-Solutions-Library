package Douwei;
import java.util.*;
public class PalindromeOrNot {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	if(palindrome(str))
		System.out.println("YES");
	else
		System.out.println("NO");
}
public static boolean palindrome(String str) {
	String palindrome = "";
	for(int i=str.length()-1;i>=0;i--) {
		char c = str.charAt(i);
		palindrome+=c;
	}
	if(palindrome.equals(str))
		return true;
	else
		return false;
}
}
