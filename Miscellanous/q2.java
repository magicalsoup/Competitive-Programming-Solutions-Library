import java.util.Scanner;
	public class q2 {	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String t = scan.nextLine();
			
			int counter = 0;
			int count = 0;
			for(int i = 0; i<t.length(); i++ ) {
				if(t.charAt(i) == 'a'||t.charAt(i) == 'A' ) {
					counter++;
				} 
				else if(t.charAt(i) == 'i'||t.charAt(i) == 'e'||t.charAt(i) == 'o'||t.charAt(i) == 'u') {
					count++;
				}
			}
			if(counter >= count) {
				System.out.println("Advance to next round");
			}
			else if(count > counter) {
				System.out.println("Does not advance to next round");
			}
		}
	}
