package Douwei;
import java.util.*;
public class CharPractice3 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	if(str.length()%2!=0) 
		System.out.println(str.charAt(str.length()/2));
		else {
			System.out.print(str.charAt(str.length()/2-1));
		System.out.print(str.charAt(str.length()/2));
}
}
}
