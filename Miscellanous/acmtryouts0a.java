import java.util.Arrays;
import java.util.Scanner;
public class acmtryouts0a{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			int a = scan.nextInt();
			int arr[] = new int[a];
			for(int j=0;j<a;j++) {
				arr[j]=scan.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[a-1]);
		}
		
	}
}
