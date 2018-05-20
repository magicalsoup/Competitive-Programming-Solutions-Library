import java.util.Scanner;
public class p287ex5 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		int arr[] = new int[t];
		for(int i=0;i<t;i++) {
			arr[i] =scan.nextInt();		
			}
		for(int j=0;j<t;j++) {
			
		 if(arr[j]>-10&&arr[j]<10) {
				System.out.println("1");
			}
			else if(arr[j]>-100&&arr[j]<100) {
				System.out.println("2");
			}
			else if(arr[j]>-1000&&arr[j]<1000) {
				System.out.println("3");
			}
			else if(arr[j]>-10000&&arr[j]<10000) {
				System.out.println("4");
			}
			else if(arr[j]>-100000&&arr[j]<100000) {
				System.out.println("5");
			}
			else if(arr[j]>-1000000&&arr[j]<1000000) {
				System.out.println("6");
			}	
			}
		}
		}
