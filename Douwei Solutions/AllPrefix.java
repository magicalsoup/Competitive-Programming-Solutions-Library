package Douwei;
import java.util.*;
public class AllPrefix {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	int count = 1;
	for(int i=0;i<s.length();i++) {
	for(int j=0;j<=i;j++) {
		char c = s.charAt(j);
		System.out.print(c);
	}
	System.out.println();
	}
}
}
