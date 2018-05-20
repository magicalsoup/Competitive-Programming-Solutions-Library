import java.util.Scanner;

public class coci064p1 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b =scan.nextInt();
int c =scan.nextInt();
double t = Math.sqrt((b*b)+(c*c));
	int arr[] = new int[a+1];
	for(int i =1;i<=a;i++) {
		arr[i] =scan.nextInt();
		
		if(arr[i]> b*c||arr[i]>t)
		 System.out.println("NE");


	
		 else if(arr[i]<= b*c||arr[i]<=t)
	 System.out.println("DA");

	 }
		}
	
	 }
