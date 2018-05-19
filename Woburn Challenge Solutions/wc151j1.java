import java.util.Scanner;

public class wc151j1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

	String a = scan.nextLine();
	String b = scan.nextLine();
	
	if((a).equals("RED")&&(b).equals("BLUE")||(b).equals("RED")&&(a).equals("BLUE")) {
		System.out.println("WHITE");
	}
	
	if((a).equals("WHITE")&&(b).equals("BLUE")||(b).equals("WHITE")&&(a).equals("BLUE")) {
		System.out.println("RED");
	}
	
	if((a).equals("RED")&&(b).equals("WHITE")||(b).equals("RED")&&(a).equals("WHITE")) {
		System.out.println("BLUE");
	}
	
	
	}
	}
