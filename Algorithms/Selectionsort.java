import java.util.*;
public class Selectionsort {
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
		int min,minindex;
		for(int i=0;i<arr.length;i++)
		{
			min = arr[i];
			minindex = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min = arr[j];
					minindex = j;
				}
			}
			arr[minindex] = arr[i];
			arr[i] = min;
		}
	}
	public static void printArr(int arr[]) {
		for(int i:arr)
			System.out.println(i);
	}
}
