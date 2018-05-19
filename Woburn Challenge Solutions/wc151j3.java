import java.util.Scanner;
public class wc151j3 {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int t =scan.nextInt();
int arr[] = new int[t];
for(int i=0;i<t;i++) {
	arr[i] = scan.nextInt();
		}
int temp=0;
int N = arr.length;
for(int i=0;i<t;i++) {
			 for (int j = 1; j <(N-i) ;j++) {
				 if (arr[ j-1] <arr[j]) {
					 //swap elements
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr [j] = temp;
				 } 
					 
				 }
			 }
	int sum =0;	
	for (int k =0;k<N;k++) {
	sum = sum+arr[k];		
}
	int totalsum = sum+arr[0]+arr[1]+10;
	System.out.println(totalsum);
	
	
	
		}
		}
