import java.util.*;
public class coci061p3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		output(input);
	}
public static void output(String s) {
	String l1 = "";
	String l2 = "";
	String l3 = "";
	for(int i=0;i<s.length();i++) {
		if((i+1)%3==0) {
			l1+= "..*..";
			l2 +=".*.*.";
			l3+="*."+s.charAt(i)+".*";
		}
		else {
			if((i)%3==0&&i!=0) {
				l1+=".#.";
				l2+= "#.#";
				l3+= "."+s.charAt(i)+".";
			}
			else {
				l1+="..#.";
				l2+=".#.#";
				l3+="#."+s.charAt(i)+".";
			}
			if(i+1==s.length()) {
				l1+=".";
				l2+=".";
				l3+="#";
			}
		}
	}
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l3);
	System.out.println(l2);
	System.out.println(l1);
}
}
