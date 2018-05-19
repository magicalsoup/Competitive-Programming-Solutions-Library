import java.util.*;
public class wc173j3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	if(password(s))
		System.out.println("Valid");
	else
		System.out.println("Invalid");
}
public static boolean password(String s) {
	int numcount =0;
	int cap =0;
	int low = 0;
for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c>=48&&c<=57) {
			numcount++;
		}
		if(c>=65&&c<=90) {
			cap++;
		}
		if(c>=97&&c<=122) {
			low++;
		}
	}
if(s.length()>=8&&s.length()<=12&&numcount>=1&&cap>=2&&low>=3)
	return true;
else
	return false;
}
}
