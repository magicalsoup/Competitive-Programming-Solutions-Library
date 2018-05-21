package Douwei;
import java.util.*;
public class HandelTheBits {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int commands = sc.nextInt();
	while(commands-->0) {
		String com = sc.next();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(com.equals("LSHIFT"))
			System.out.println(a<<b);
		if(com.equals("RSHIFT"))
			System.out.println(a>>b);
		if(com.equals("AND"))
			System.out.println(a&b);
		if(com.equals("XOR"))
			System.out.println(a^b);
		if(com.equals("OR"))
			System.out.println(a|b);
	}
	
}
}
