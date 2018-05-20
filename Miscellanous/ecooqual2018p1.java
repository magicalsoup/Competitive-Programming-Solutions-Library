import java.util.Scanner;
public class ecooqual2018p1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int f = 0;
	for(int i=0;i<n;i++) {
		int t = scan.nextInt();
		int arr[] = new int[t];
		int arr2[] = new int[t];
		for(int j=0;j<t;j++) {
			arr[j] = scan.nextInt();
		}
		for(int k =0;k<t;k++) {
			arr2[k] = scan.nextInt();
			}
		for(int p =0;p<t;p++) {
			f = f+(arr[p]*arr2[p]);
		}
	System.out.println(f);
	f = 0;
	}
}
}
