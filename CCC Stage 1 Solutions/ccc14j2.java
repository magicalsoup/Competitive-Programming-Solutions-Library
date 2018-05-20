import java.util.Scanner;
public class ccc14j2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int v = scan.nextInt();
		String s = scan.nextLine();
		String t = scan.nextLine();
		
		int counter = 0;
		int count = 0;
		for(int i = 0; i<t.length(); i++ ) {
			if(t.charAt(i) == 'A' ) {
				counter++;
			} 
			else if(t.charAt(i) == 'B') {
				count++;
			}
		}
		if(counter > count) {
			System.out.println("A");
		}
		else if(count > counter) {
			System.out.println("B");
		}
		else {
			System.out.println("Tie");
		}
	}
}
