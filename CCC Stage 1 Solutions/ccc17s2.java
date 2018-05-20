import java.util.Arrays;
import java.util.Scanner;
public class ccc17s2{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = scan.nextInt();
	}
	
	if(a%2!=0) {
		Arrays.sort(arr);
		for(int i=1;i<=a/2;i++) {
			System.out.print(arr[(a/2)-i+1]+" ");
			System.out.print(arr[(a/2)+i]+" ");	
		}
		System.out.print(arr[0]);
	}
	
	if(a%2==0) {
	Arrays.sort(arr);
	for(int i=0;i<a/2;i++) {
		System.out.print(arr[(a/2)-i-1]+" ");
		System.out.print(arr[(a/2)+i]+" ");
	}
	}
	
	}
}
