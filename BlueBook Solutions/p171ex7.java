import java.util.Scanner;

public class p171ex7 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while(true) {
			 int a=0;
			 int b=0;
			 int c=0;
			 int d=0;
			 int e=0;
			 int f=0;
			int arr[]= new int[10000];
			int s =arr.length;
			for(int i =0;i<s;i++) {
				arr[i] = scan.nextInt();

				if(arr[i]== -1) {
				break;
			}
			
			}
		

		
		for(int j=0;j<s;j++) {
			
				if(arr[j]== -1) {
				break;
			}
			  else if(arr[j]>=0&&arr[j]<=9999) {
			 a=a+1;}
			  else if(arr[j]>=10000&&arr[j]<=19999) {
			 b=b+1;}
			  else if(arr[j]>=20000&&arr[j]<=29999) {
			 c=c+1;}
			  else if(arr[j]>=30000&&arr[j]<=39999) {
			 d=d+1;}
			  else if(arr[j]>=40000&&arr[j]<=49999) {
			 e=e+1;}
			  else if(arr[j]>=50000&&arr[j]<=1000000) {
			 f=f+1;}
		}
			  for(int i=0;i<1;) {
			  	 System.out.println(a);
				 System.out.println(b);
				 System.out.println(c);
				 System.out.println(d);
				 System.out.println(e);
				 System.out.println(f);
				 break;
			  }
		
		}
		}
}
	
