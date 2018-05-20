import java.util.Scanner;
public class fur1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[] = new int[t];
		for(int i=0;i<t;i++) {
			arr[i] = scan.nextInt();
	}
		int temp = arr[0] * arr[t-1];
		
			 for (int j = 1; j <t ;j++) {
					 if(arr[j] * arr[j-1]>temp) {
					 temp = arr[j] * arr[j-1];
				 }
			}
			 
			System.out.println(temp);
		
}
}
