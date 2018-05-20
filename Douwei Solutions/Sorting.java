package Douwei;
import java.util.*;
public class Sorting {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i=a-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
}
