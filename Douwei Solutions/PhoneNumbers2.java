package Douwei;
import java.util.*;
public class PhoneNumbers2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[10000];
	for(int i=0;i<a;i++) {
		String str=  sc.next();
		String arr2[] = str.split("-");
		int num = Integer.parseInt(arr2[0]);
		arr[num]++;
	}
	int count =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0)
			count++;
	}
	System.out.println(count);
}
}
