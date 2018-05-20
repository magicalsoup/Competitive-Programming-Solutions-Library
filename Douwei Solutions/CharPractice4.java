package Douwei;
import java.util.*;
public class CharPractice4 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	LinkedList<Character> list = new LinkedList<Character>();
	for(int i=0;i<str.length();i++) {
		char c  =  str.charAt(i);
		if(c=='A'||c=='a') {
		if(c>=65&&c<=90)
			c = (char)(c+32);
		else
			c = (char)(c-32);
		System.out.print(c);
		}
	}
	for(int i=0;i<str.length();i++) {
		char c  =  str.charAt(i);
		if(c=='E'||c=='e') {
		if(c>=65&&c<=90)
			c = (char)(c+32);
		else
			c = (char)(c-32);
		System.out.print(c);
		}
	}
	for(int i=0;i<str.length();i++) {
		char c  =  str.charAt(i);
		if(c=='I'||c=='i') {
		if(c>=65&&c<=90)
			c = (char)(c+32);
		else
			c = (char)(c-32);
		System.out.print(c);
		}
	}
	for(int i=0;i<str.length();i++) {
		char c  =  str.charAt(i);
		if(c=='O'||c=='o') {
		if(c>=65&&c<=90)
			c = (char)(c+32);
		else
			c = (char)(c-32);
		System.out.print(c);
		}
	}
	for(int i=0;i<str.length();i++) {
		char c  =  str.charAt(i);
		if(c=='U'||c=='u') {
		if(c>=65&&c<=90)
			c = (char)(c+32);
		else
			c = (char)(c-32);
		System.out.print(c);
		}
	}
}
}
