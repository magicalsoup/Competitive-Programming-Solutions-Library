import java.util.Scanner;

public class ccc14j3{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int d = 100;
		int a = 100;
		
		for(int i = 0; i < n; i++) {
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}// end of for
		
		for(int i = 0; i < n;i++) {
			if(arr1[i] < arr2[i]) {
				a = a - arr2[i]; 
			}
			else if(arr2[i] < arr1[i]) {
				d = d - arr1[i];
			}
			else if(arr1[i] == arr2[i]) {
				d = d + 0;
				a = a + 0;
			}
		}//end of for
		System.out.println(a);
		System.out.println(d);
	}
}


