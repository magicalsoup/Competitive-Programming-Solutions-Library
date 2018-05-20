	import java.util.Arrays;
import java.util.Scanner;

public class mockccc15j3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		
		int count = n;
		
		for (int i = 0; i < n; i++) {
		    for (int k = i + 1; k < n; k++) {
		        if (arr[i] == arr[k]) {
		        	count--;
		        	break;
		        }
		    }
		}
		
		
		System.out.println(count);
	}
}

