
import java.util.Scanner;

public class ccc04j3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		String arr1[] = new String[a];
		String arr2[] = new String[b];
		String t = scan.nextLine();
		
		for(int i = 0; i < a; i++) {
			arr1[i] = scan.nextLine();
		}
		for(int i = 0; i < b; i++) {
			arr2[i] = scan.nextLine();
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(arr1[i] + " as " + arr2[j]);
				System.out.println();
			}
		}
	
	}
}


