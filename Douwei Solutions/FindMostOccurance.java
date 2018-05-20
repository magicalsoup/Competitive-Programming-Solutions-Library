package Douwei;
import java.util.*;
public class FindMostOccurance {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	int ans = arr[a-1];
	int maxcount =0;
	int count =1;
	for(int i=a-1;i>0;i--) {
		if(ans == arr[i]) {
			count++;
		}
		else {
			if(count>maxcount) {
				maxcount = count;
			}
			ans = arr[i];
		}
	}
	System.out.println(ans);
}
}
