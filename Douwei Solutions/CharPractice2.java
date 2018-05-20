package Douwei;
import java.util.*;
public class CharPractice2{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	for(int i=0;i<a.length();i++) {
		char c = a.charAt(i);
		if(c=='a'||c=='i'||c=='e'||c=='u'||c=='o'||c=='A'||c=='I'||c=='U'||c=='O'||c=='E')
			System.out.print(c);
	}
}
}
