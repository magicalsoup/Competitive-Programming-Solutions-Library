import java.util.Scanner;
public class climb {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int e = scan.nextInt();
	int arr[] = new int[n];
	boolean t = true;
	int climb = 1;
	for(int i=0;i<n;i++) {
		arr[i] = scan.nextInt();
		if(arr[i]-climb<=m) {
			t = true;
			climb = arr[i];
		}
		else if(arr[i]-climb>m&&arr[i]-climb<=m*2&&e!=0) {
			t = true;
			climb = arr[i];
			e--;
		}
		else {
			t = false;
			break;
		}
	}
	if(t==false) {
		System.out.println("Unfair!");
	}
	if(t==true) {
		System.out.println("Too easy!");
	}
}
}
