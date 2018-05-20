import java.util.Scanner;
public class acmtryouts0b{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	//scan.next();
	for(int i=0;i<n;i++) {
		int t = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		String s1 = scan.nextLine();
		String arr[] = s.split("(?!^)");
		String arr1[] = s1.split("(?!^)");
		for(int j=t-1;j>=0;j--) {
		System.out.print(arr1[j]);
		System.out.print(arr[j]);
		}
		System.out.println();
	}
}
}
