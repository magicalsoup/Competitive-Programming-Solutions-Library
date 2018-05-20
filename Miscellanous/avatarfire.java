import java.util.Arrays;
import java.util.Scanner;
public class avatarfire{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();//number of leafs
		int b = scan.nextInt();// 3 leafs that can be saved
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<b;i++) {
			arr[i] = arr[i]*2;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
	}

}
