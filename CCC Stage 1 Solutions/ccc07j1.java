
import java.util.Scanner;

public class ccc07j1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[3];
		for(int i=0;i<3;i++)
			arr[i] = scan.nextInt();
		int temp = 0;
		//int N = arr.length;
		 {
			for(int i=0;i<3;i++)
			{
			 for (int j = 1; j < 3 ;j++) {
				 if (arr [ j-1] > arr[j]) {
					 //swap 
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr [j] = temp;
					 
	
	
	
	}
}
			}
		
			for(int i=0;i<1;i++)
				 System.out.println(arr[i+1]);
		
		}
	}
}