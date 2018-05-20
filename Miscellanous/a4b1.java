import java.util.Scanner;
public class a4b1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int arr[] = new int[t];
		for(int i=0;i<t;i++)
			arr[i] = scan.nextInt();
		int temp = 0;
		int N = arr.length;
		if(t < 100) {
			for(int i=0;i<t;i++)
			{
			 for (int j = 1; j <(N-i) ;j++) {
				 if (arr [ j-1] >	arr[j]) {
					 //swap elements
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr [j] = temp;
					 
					 
				 }
			 }
			}
		}
		for(int i=0;i<t;i++)
			System.out.println(arr[i]);
	}
}
