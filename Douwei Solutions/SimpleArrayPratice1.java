package Douwei;
import java.util.*;
public class SimpleArrayPratice1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[a];
	int sum =0;
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
		sum = sum+arr[i];
	}
	int average = sum/a;
	for(int i=0;i<a;i++) {
	if(average>=90) {
		arr[i] = (int)(arr[i]*0.9);
	}
	else if(average<65) {
		arr[i] = (int)(arr[i]*1.1);
	}
	}
	for(int i=0;i<a;i++) {
	System.out.println(arr[i]);
	}
}
}
