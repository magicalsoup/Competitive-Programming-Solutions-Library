import java.util.Scanner;

public class ccc07j2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
for(int i = 0; i < 1000000; i++) {
	String arr[];
	String t = scan.nextLine();
	
	if((t).equals("CU")) {
		System.out.println("see you");
	}
	else if((t).equals(":-)")) {
		System.out.println("I'm happy");
	}
	else if((t).equals(":-(")) {
		System.out.println("I'm unhappy");
	}
	else if((t).equals(";-)")) {
		System.out.println("wink");
	}
	else if((t).equals(":-P")) {
		System.out.println("stick out my tongue");
	}
	else if((t).equals("(~.~)")) {
		System.out.println("sleepy");
	}
	else if((t).equals("TA")) {
		System.out.println("totally awesome");
	}
	else if((t).equals("CCC")) {
		System.out.println("Canadian Computing Competition");
	}
	else if((t).equals("CUZ")) {
		System.out.println("because");
	}
	else if((t).equals("TY")) {
		System.out.println("thank-you");
	}
	else if((t).equals("YW")) {
		System.out.println("you're welcome");
	}
	else if ((t).equals("TTYL")) {
		System.out.println("talk to you later");
		break;
		
	}
	else
		System.out.println(t);
	}
}
}


