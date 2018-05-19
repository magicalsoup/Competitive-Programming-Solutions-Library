import java.util.Scanner;
public class wc171j3{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int arr[] = new int[7];
	int arr2[] = new int[7];
	int count=0;
	int count1 =0;
	for(int i=0;i<7;i++) {
		arr[i] = scan.nextInt();
		arr2[i] = scan.nextInt();
	}
	for(int j=0;j<7;j++) {
		if((count==4||count1==4)) {
			break;
		}
		if(arr[j]>arr2[j]) {
			count++;
		}
		if(arr2[j]> arr[j]) {
			count1++;
		}
	}
		System.out.println(count+" "+count1);
	}
}
