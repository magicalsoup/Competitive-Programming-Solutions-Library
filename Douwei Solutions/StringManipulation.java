package Douwei;
import java.util.*;
public class StringManipulation {
public static void main(String[]args) {
	Scanner sc=  new Scanner(System.in);
	String a = sc.nextLine();
	if(a.length()<=3) {
		System.out.println(0);
	return;
	}
	String b = a.substring(a.length()-3, a.length());
	if(a.length()>3)
	System.out.println(check(a,b));
}
public static int check(String a,String b) {
	int count =0;
for(int i=0;i<a.length()-3;i++) {
	if(a.charAt(i)==b.charAt(0)&&a.charAt(i+1)==b.charAt(1)&&a.charAt(i+2)==b.charAt(2))
		count++;
}
return count;
}
}
