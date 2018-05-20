package Douwei;
import java.util.*;
public class HowManySubStrings {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i=0;i<s.length()-2;i++) {
				if(s.charAt(i)=='a'&&s.charAt(i+1)=='b'&&s.charAt(i+2)=='a'||s.charAt(i)=='a'&&s.charAt(i+1)=='b'&&s.charAt(i+2)=='c') {
					count++;
				}
	}
	System.out.println(count);
}
}
