
import java.util.Arrays;
import java.util.Scanner;
public class coci071p1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
		int arr2[] = new int[3];
		for(int i=0;i<3;i++) {
			arr[i]= scan.nextInt();
			arr2[i]= scan.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int t = (arr[0]-arr[1])+arr[2];
		int s =(arr2[0]-arr2[1])+arr2[2];
		System.out.print(t+" "+s);
		}
	}


