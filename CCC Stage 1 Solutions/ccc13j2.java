import java.util.Scanner;
public class ccc13j2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String t = scan.nextLine();
		
		for(int i = 0; i<t.length();i++) {
			
			 if(t.charAt(i) == 'A'||t.charAt(i) == 'B' ||t.charAt(i) == 'C'||
					 t.charAt(i) == 'D' ||	 t.charAt(i) == 'E' ||	 t.charAt(i) == 'F' ||	 t.charAt(i) == 'G' ||
					 t.charAt(i) == 'J' ||	 t.charAt(i) == 'K' ||	 t.charAt(i) == 'L' ||	 t.charAt(i) == 'M' ||	 t.charAt(i) == 'P' ||
					 t.charAt(i) == 'Q' ||	 t.charAt(i) == 'R' ||	 t.charAt(i) == 'T' ||	 t.charAt(i) == 'U' ||	 t.charAt(i) == 'V' ||
					 t.charAt(i) == 'W' ||	 t.charAt(i) == 'Y') {
				 System.out.println("NO");
				 System.exit(0);
			 }
			 //else  if(t.charAt(i) == 'I' ||t.charAt(i) == 'O' ||t.charAt(i) == 'S' ||t.charAt(i) == 'H' ||t.charAt(i) == 'Z' ||t.charAt(i) == 'X' ||t.charAt(i) == 'N' ) {
					//System.out.println("YES");
					//break;
				//}
			
			 }
		for(int i = 0; i<t.length();i++) {
			 if(t.charAt(i) == 'I' ||t.charAt(i) == 'O' ||t.charAt(i) == 'S' ||t.charAt(i) == 'H' ||t.charAt(i) == 'Z' ||t.charAt(i) == 'X' ||t.charAt(i) == 'N' ) {
					System.out.println("YES");
					System.exit(0);
			 }
		}
			
		}
		}	
	

