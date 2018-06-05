import java.util.*;
public class BubbleSort {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
		arr[i] = sc.nextInt();
	sort(arr);
	printArr(arr);
	sc.close();
	}
	public static void sort(int arr[]) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap = true;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	public static void printArr(int arr[]) {
		for(int i: arr)
			System.out.println(i);
	}
}
