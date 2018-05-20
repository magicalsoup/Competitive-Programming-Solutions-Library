
import java.util.Scanner;
public class ccc98s1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		for(int j=0;j<=w;j++) {
		String s = scan.nextLine();
				String arr[] = s.split(" ");
				for(int i = 0; i < arr.length; i++) {
					int t = arr[i].length();
					if(t==4) {
						System.out.print("**** ");
					}
					else
						System.out.print(arr[i] + " ");
				}
			System.out.println();
		}
		
		}
}
