import java.util.*;
public class ccc03s2{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n =	Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++) {
		String l1 = sc.nextLine().toLowerCase();
		l1 = l1.substring(l1.lastIndexOf(" ")+1);
		String l2 = sc.nextLine().toLowerCase();
		l2 = l2.substring(l2.lastIndexOf(" ")+1);
		String l3 = sc.nextLine().toLowerCase();
		l3 = l3.substring(l3.lastIndexOf(" ")+1);
		String l4 = sc.nextLine().toLowerCase();
		l4 = l4.substring(l4.lastIndexOf(" ")+1);
		
		l1 = lastvowel(l1);
		l2 = lastvowel(l2);
		l3 = lastvowel(l3);
		l4 = lastvowel(l4);
		if(l1.equals(l2)&&l2.equals(l3)&&l3.equals(l4)) {
			System.out.println("perfect");
		}
		else if(l1.equals(l2)&&l3.equals(l4)) {
			System.out.println("even");
		}
		else if(l1.equals(l3)&&l2.equals(l4)) {
			System.out.println("cross");
		}
		else if(l1.equals(l4)&&l2.equals(l3)) {
			System.out.println("shell");
		}
		else {
			System.out.println("free");
		}
	}	
	sc.close();
	}
	public static String lastvowel(String s) {
		int a = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				a = i;
			}
		}
	return s.substring(a);
}
}
