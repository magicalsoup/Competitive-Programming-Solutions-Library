import java.util.Scanner;
public class chocolate{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		int arr2[] = new int[a];
		for(int i =0;i<a;i++) {
			arr[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}
		for(int i=0;i<a;i++) {
			int s = arr[i]*arr2[i];
			 int t = s-1;
				System.out.println(t);
		}
	}
}
