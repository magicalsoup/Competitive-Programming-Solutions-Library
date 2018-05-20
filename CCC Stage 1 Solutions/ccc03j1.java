import java.util.Scanner;

public class ccc03j1{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		for(int s = 0; s < a; s++){
			System.out.println();		
			for(int i = 0; i < 3; i++) {
				System.out.print("*");
				for(int j = 0; j < b; j++) {
					System.out.print(" ");
				}
			}
		}//end of 1st for
		System.out.println();
		System.out.print("***");
		for(int u = 0; u < b; u++) {
			System.out.print("**");
		}//end of 2nd for
		for(int y = 0; y < c; y++) {
			System.out.println();
			System.out.print(" ");
			for(int q = 0; q < b; q++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}//end of 3rd for
	}
}
