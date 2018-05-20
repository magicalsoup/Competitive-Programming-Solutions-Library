import java.util.Scanner;
public class p129ex5{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);

	//char c = reader.findInLine(".").charAt(0);
	String tempc1 = scan.nextLine();
	char[] tempc2 = tempc1.toCharArray();
	char c = tempc2[0];
	//System.out.println("DEBUG c is " + c);
	String b = scan.nextLine();
	char[] ch=b.toCharArray();
	int count =0;
	 char ch1 = Character.toLowerCase(c);
	
	 for(int i=0;i<ch.length;i++) {
		 
		char ch2 = Character.toLowerCase(ch[i]);
		if(ch2 =='.') {
			 break;
		 }
		if(ch1 == ch2) {
			count++;
			
		}
	
	}
	System.out.println(b);
	System.out.println(count);
	}
	
	}
	

