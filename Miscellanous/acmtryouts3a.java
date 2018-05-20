import java.util.Arrays;
import java.util.Scanner;
public class acmtryouts3a{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int temp =0;
		while(temp<a) {
			int b = scan.nextInt();
			int arr[] = new int[b];
			for(int i=0;i<b;i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0]+" "+arr[b-1]);
			temp++;
		}
	}
}
