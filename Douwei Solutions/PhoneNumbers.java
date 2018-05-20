package Douwei;
import java.util.Scanner;
public class PhoneNumbers {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[90000];
	for(int i=0;i<a;i++) {
		String str=  sc.next();
		String arr2[] = str.split("-");
		int num = Integer.parseInt(arr2[1])+Integer.parseInt(arr2[2]);
		arr[num]++;
	}
	int count =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>1)
			count++;
	}
	System.out.println(count);
}
}
