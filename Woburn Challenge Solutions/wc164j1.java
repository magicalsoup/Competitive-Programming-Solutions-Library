import java.util.Scanner;
public class wc164j1{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int o1  = scan.nextInt();
	int o2 = scan.nextInt();
	int leftover = 0;
	int leftover2 =0;;
	int count1= 0;
	int count2 =0;
	int finalcount =0;
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = scan.nextInt();
		if(arr[i]==1) {
			count1++;
		}
		if(arr[i]==2) {
			count2++;
			//System.out.println(count2);
		}
	}
	for(int i=0;i<n;i++) {
		if(count1>o1) {
			leftover= count1-o1;
		}
		if(count2>o2) {
			leftover2= count2-o2;
		}
	}
	finalcount = Math.max(leftover, leftover2);
	System.out.println(n-finalcount);
	}
}
