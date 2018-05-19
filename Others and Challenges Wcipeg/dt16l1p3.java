import java.util.Scanner;
public class dt16l1p3{
	public static boolean inCharArray(char c,char[] charArray) {
		boolean in = false;
		for(int i=0;i<charArray.length;i++) {
			if(c==charArray[i]) {
			in = true;
			}
		}
		return in;
	}
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char vowels[]= {'A','E','I','O','U','a','e','i','o','u'};
		char special[] = {'x','y','z','q'};
	 if(s.charAt(0)>='A'&&s.charAt(0)<='Z' && inCharArray(s.charAt(0), vowels)) {
			System.out.println("verb");
			if(inCharArray(s.charAt(4), special)) {
				System.out.println("boring verb");
			}
		}
	 else 
	  if(s.charAt(0)>='A'&&s.charAt(0)<='Z') {
			System.out.println("noun");
			if(inCharArray(s.charAt(3),vowels)) {
				System.out.println("fancy noun");
			}
		}
			else {
				System.out.println("adjective");
				if(!inCharArray(s.charAt(2),vowels)) {
					System.out.println("odd adjective");
				}
			}
	}
}
