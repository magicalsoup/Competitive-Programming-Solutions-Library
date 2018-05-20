package Douwei;
import java.util.Scanner;
public class ArrayPratice6 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a=  sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i = a-1;i>=0;i--)
		if(arr[i]/100%10==0||arr[i]/10%10==0||arr[i]%10==0) {
			System.out.print(arr[i]+" ");
		}
	}
}
