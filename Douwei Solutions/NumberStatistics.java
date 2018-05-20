package Douwei;
import java.util.*;
public class NumberStatistics {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	long arr[] = new long[10000000];
	long arr2[] = new long[1000000];
	int a = sc.nextInt();
	for(int i=0;i<a;i++) {
		int v = sc.nextInt();
		arr[v]++;
		arr2[v] = v;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0)
			System.out.println(arr2[i]+" "+arr[i]);
	}
}
}
