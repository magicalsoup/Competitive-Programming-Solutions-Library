package Douwei;
import java.util.Scanner;
public class SortingTrains {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int arr[] = new int[a];
for(int i=0;i<a;i++) {
	arr[i] = sc.nextInt();
}
boolean swap = false;
int count =0;
while(!swap) {
	swap = true;
	for(int i=1;i<a;i++) {
		if(arr[i-1]>arr[i]) {
			int temp = arr[i-1];
			arr[i-1] = arr[i];
			arr[i] = temp;
			swap  = false;
			count++;
		}
	}
}
System.out.println(count);
}
}