package Douwei;
import java.util.*;
public class ArrayDelete {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a  =sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	int n = sc.nextInt();
	for(int i=0;i<a;i++) {
		if(arr[i]==n) {
			arr[i] = Integer.MAX_VALUE;
		}
	}
	for(int i=0;i<a;i++) {
		if(arr[i]!=Integer.MAX_VALUE) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
