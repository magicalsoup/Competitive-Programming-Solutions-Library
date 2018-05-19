import java.util.Scanner;
public class wc97p4{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	    Scanner scan = new Scanner(System.in);
	   int a = scan.nextInt();
	   scan.nextLine();
	   int temp =0;
	    while(temp<a){
		String sentence = scan.nextLine();
		sentence.replace(",","");
		sentence.replace(" ","");
		sentence.replace(".","");
		if(isPangram(sentence)){
		System.out.println("OK.");
		}
		else{
		    System.out.println("Nope.");
		}
	        temp++;
	    }
	}

	public static boolean isPangram(String sentence) {

		if (sentence.length() < 26||sentence.length()>26) {
			return false;
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (sentence.indexOf(ch) < 0
					&& sentence.indexOf((char) (ch + 32)) < 0) {
				return false;
			}
		}

		return true;
	}
}
