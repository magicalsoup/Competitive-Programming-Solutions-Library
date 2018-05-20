import java.util.Arrays;
import java.util.Scanner;
public class coci061p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
	int arr[] = new int[10];
	int arr2[] = new int[10];
	for(int i=0;i<10;i++) {
		arr[i] = scan.nextInt();
	}
	int min = 100000;
	int count =0;
	for(int i=0;i<10;i++) {
		arr[i] = arr[i]%42;
		 arr2[i] = arr[i];
	}
	Arrays.sort(arr2);
	for(int i=0;i<10;i++) {
	 if(arr2[i]!=min) {
		 min = arr2[i];
		 count++;
	 } 
	}
	System.out.println(count);
	}
}
