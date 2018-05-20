

import java.util.Scanner;

public class p299ex4{
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int  arr[] = new int[10000];
		int s = scan.nextInt();
	
		int primeflag = 1;
		
		for(int i = 0; i<s;i++)	{
			arr[i] =scan.nextInt();
		}

		//for(int k = 1; k<s;k++)	{

		//if(arr[i]==1) {
		//	System.out.println("0");
		//	System.exit(0);
		
		for(int i = 0; i < s; i ++) {
			primeflag = 1;
			for(int j=2;j<arr[i];j++) {
				    //System.out.println("DEBUG now arr["+i+"] is"+arr[i]);
					if((arr[i]%j == 0) && (arr[i] != 2)){
					//System.out.println("0");
					//break;
					primeflag = 0;
				}
			}
			if (arr[i] == 1) {
				primeflag = 0;
			}
	        if (primeflag == 1) {
	        	System.out.println("1");
	        }else {
	        	System.out.println("0");
	        }
		}
	}
}
