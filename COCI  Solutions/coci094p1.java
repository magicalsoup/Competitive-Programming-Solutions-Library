import java.util.Scanner;
public class coci094p1 {
		public static void main(String[]args) {
			@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
			String a = scan.nextLine();
			String outputString = "";

			for (int i = 0; i < a.length(); i++) {
			   char c = a.charAt(i);
			    outputString += Character.isUpperCase(c) ? c + "" :""; 
			}
			System.out.println(outputString);
			
			
		}
}
