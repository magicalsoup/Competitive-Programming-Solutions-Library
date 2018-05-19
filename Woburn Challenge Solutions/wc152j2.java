import java.util.Scanner;
public class wc152j2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int t=0;
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<a;i++) {
		if(arr[i]<=b) {
			t = t+arr[i];
		}
		}
	System.out.println(t);	
	}

}
