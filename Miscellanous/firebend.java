import java.util.Scanner;
public class firebend {
		public static void main (String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			int arr[] = new int [100000];
			int sum = 0;
for (int i =0; i<s;i++) {
	arr[i] = scan.nextInt();
		if(arr[i]< 0) {
			arr[i] = 0 - arr[i];
			}
		sum = sum + arr[i];
		}
System.out.println(sum);
	}			
}
