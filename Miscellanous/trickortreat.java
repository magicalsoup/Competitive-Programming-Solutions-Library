import java.util.Arrays;
import java.util.Scanner;
public class trickortreat{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int time = scan.nextInt();
		int k =0;
		int count =0;
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<a;i++) {
			k = k+arr[i];
			//System.out.println(k);
			if(k<=time) {
				count++;
			}
			k =k+1;
		}
	System.out.println(count);
	}
}
