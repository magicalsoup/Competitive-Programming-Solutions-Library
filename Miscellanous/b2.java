import java.util.Scanner;
public class b2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int reverse1=0;
		int reverse =0;
		int totalsum=0;
		int a = scan.nextInt();
		int arr[] = new int [a];
		int arr2[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}
		for(int j=0;j<a;j++) {
			while(arr[j]!=0) {
				reverse = reverse*10;
				reverse = reverse+ arr[j]%10;
				arr[j] = arr[j] /10;
			}
			while(arr2[j]!=0) {
				reverse1 = reverse1*10;
				reverse1 = reverse1+ arr2[j]%10;
				arr2[j] = arr2[j] /10;
				
			}
			if(reverse !=0&&reverse1 !=0) 
				{
				int sum = reverse+reverse1;
				while( sum!=0) {
					totalsum = totalsum*10;
				totalsum = totalsum+ sum%10;
				sum = sum/10;
			}
				reverse =0;
				reverse1 =0;
				}
			if(totalsum!=0) {
			System.out.println(totalsum);
			totalsum=0;
				
			}
		}	
	}
}
