package Douwei;
import java.util.*;
public class SimpleArrayPractice3 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	int s = sc.nextInt();
	for(int i=0;i<s;i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int temp =0;
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	for(int i=0;i<a;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
