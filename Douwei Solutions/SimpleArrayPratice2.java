package Douwei;
import java.util.*;
public class SimpleArrayPratice2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a  = sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	int count =0;
	for(int i=0;i<a;i++) {
		if(arr[i]==k) {
			count++;
		}
	}
	System.out.println(count);
}
}
