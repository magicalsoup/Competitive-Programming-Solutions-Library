package Douwei;
import java.util.*;
public class CountPairs {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String str= sc.nextLine();
	int count =0;
	for(int i=0;i<str.length()-2;i++) {
		char c = str.charAt(i);
		char d = str.charAt(i+1);
		char e = str.charAt(i+2);
		if(c==e&&c!=d) {
			count++;
		}
	}
	System.out.println(count);
}
}
