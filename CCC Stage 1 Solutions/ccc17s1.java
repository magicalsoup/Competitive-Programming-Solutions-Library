import java.util.Arrays;
import java.util.Scanner;
public class ccc17s1{
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		
		int a = scan.nextInt();
		int arr[] = new int[a];
		int arr2[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
			}
		for(int i =0;i<a;i++) {
			arr2[i] = scan.nextInt();
		}
		int k=0;
		int sum =0;
		int day =0;
		int arr3[] = new int[a];
		for(int i=0;i<a;i++) {
			k+=arr[i];
			sum+=arr2[i];
			if(k==sum) {
				day = i;
				arr3[i]=day+1;
			}
		}
		Arrays.sort(arr3);
		System.out.println(arr3[a-1]);
	}
	}
	
