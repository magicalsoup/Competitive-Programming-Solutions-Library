package Douwei;
import java.util.*;
public class reverseString {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String reverse = "";
	for(int i=s.length()-1;i>=0;i--) {
		reverse = reverse+s.charAt(i);
	}
	System.out.println(reverse);
}
}
