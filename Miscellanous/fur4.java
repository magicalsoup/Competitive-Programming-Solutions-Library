import java.util.Arrays;
import java.util.Scanner;
public class fur4{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int b = scan.nextInt();
		int arr2[] = new int[b];
		for(int i=0;i<b;i++) {
			arr2[i] = scan.nextInt();
		}
		for(int i=0;i<b;i++) {
			int n = arr2[i];
			System.out.println(arr[n-1]);
		}
		
	}
}
