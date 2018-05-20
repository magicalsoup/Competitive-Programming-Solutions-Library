

import java.util.Scanner;

public class p108ex7{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	int t =scan.nextInt();
	int arr[] =new int[t];
	int arr2[] = new int[t];		
for(int i = 0;i<t;i++) {
	arr[i]= scan.nextInt();
}
	for(int i=0;i<t;i++) {
	if(arr[i] >=0 && arr[i]<=30) {
		arr2[i] = 38;
		
		}
	else if(arr[i] >30 && arr[i]<=50) {
		arr2[i] = 55 ;
	}
	else if(arr[i] >50&& arr[i]<=100) {
		arr2[i] = 73 ;
	}
	
	
	else {
		
	arr2[i] = 73;
	for(int k=50;k<1000000;) {
		k = k + 50;
		if(arr[i] > k) {

		arr2[i] = arr2[i]+24;
	}
	else {
		break;
		}
	}
	
	}
	
	}
	for(int i =0;i<t;i++) {
		System.out.println(arr2[i]);
	}
	
	
	}
}
