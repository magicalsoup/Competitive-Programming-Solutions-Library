import java.util.Arrays;
import java.util.Scanner;

public class coci073p1 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
	for(int i=0;i<3;i++) {
		arr[i] = scan.nextInt();
	}
	Arrays.sort(arr);
if(arr[1]-arr[0]>arr[2]-arr[1]) {
	int t = arr[2]-arr[1];
	System.out.println(arr[0]+t);
}
if(arr[1]-arr[0]<arr[2]-arr[1]) {
	int t = arr[1]-arr[0];
	System.out.println(arr[1]+t);
}
if(arr[1]-arr[0]==arr[2]-arr[1]) {
	int t = arr[1]-arr[0];
	System.out.println(arr[2]+t);
}
	}
}
