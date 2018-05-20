import java.util.Scanner;
public class ccc07j3{	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		int t1 = 100;
		int t2 = 500;
		int t3 = 1000;
		int t4 = 5000;
		int t5 = 10000;
		int t6 = 25000;
		int t7 = 50000;
		int t8 = 100000;
		int t9 = 500000;
		int t10 = 1000000;
		int count = 10-a;
		for(int i=0;i<a;i++) {
			if(arr[i] == 1) {
				t1 = 0;
			}
			if(arr[i]==2) {
				t2 = 0;
			}
			if(arr[i]==3) {
				t3 =0;
			}
			if(arr[i]==4) {
				t4 = 0;
			}
			if(arr[i]==5) {
				t5 = 0;
			}
			if(arr[i]==6) {
				t6 = 0;
			}
			if(arr[i]==7) {
				t7 = 0;
			}
			if(arr[i]==8) {
				t8 = 0;
			}
			if(arr[i]==9) {
				t9 = 0;
			}
			if(arr[i]==10) {
				t10 = 0;
			}
		}
		int finalmoney = t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
		int money = scan.nextInt();
		if(finalmoney/count<money) {
			System.out.println("deal");
		}
		else {
			System.out.println("no deal");
		}
		
	}
}
