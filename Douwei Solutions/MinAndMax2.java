package Douwei;
import java.util.*;
public class MinAndMax2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int m =sc.nextInt();
	for(int i=0;i<m;i++) {
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int j=0;j<a;j++)
			arr[j] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[a-1]-arr[0]);
	}
}
}
