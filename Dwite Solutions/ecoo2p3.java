import java.util.Scanner;
public class ecoo2p3{
public static void main(String[]agrs) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[5];
	int arr2[] = new int[5];
	for(int i=0;i<5;i++) {
		arr[i]= scan.nextInt();
		arr2[i] = scan.nextInt();
	}
	int sum =0;
	for(int j=0;j<5;j++) {
		if(arr[j]<arr2[j]) {
			for(int i=arr[j];i<arr2[j];i++) {
				sum = sum+i;
				System.out.print(i+"+");
			}
			int sum1 = sum+arr2[j];
			System.out.println(arr2[j]+"="+sum1);
			sum=0;
		}
					if(arr[j]>arr2[j]) {
				for(int i=arr2[j];i<arr[j];i++) {
					sum = sum+i;
					System.out.print(i+"+");
				}
				int sum1 = sum+arr[j];
				System.out.println(arr[j]+"="+sum1);
				sum=0;
	}
	}
	
}
}
