
import java.util.Scanner;

public class test2017p2{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = scan.nextInt();
		}

		int t = 0;

		
		for(int j = 0; j < n; j++) {
			t =  t  + arr[j];
		}

		if(b < t){
				System.out.println("The budget will balance itself");
				
			
				}
		else {
			System.out.println(b-t);
			}		

}
}

