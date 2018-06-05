import java.util.*;
public class Quicksort {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int list[] = new int[n];
	for(int i=0;i<n;i++) 
	list[i] = sc.nextInt();
	sort(list,0,n-1);
	printArr(list);
	sc.close();
}
public static int partition(int arr[], int low, int high)
{
    int pivot = arr[high]; 
    int i = (low-1); // index of smaller element
    for (int j=low; j<high; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (arr[j] <= pivot)
        {
            i++;

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;
}


	/* The main function that implements QuickSort()
  	arr[] --> Array to be sorted,
  	low  --> Starting index,
  	high  --> Ending index */
	public static void sort(int arr[], int low, int high)
{
    if (low < high)
    {
        /* pi is partitioning index, arr[pi] is 
          now at right place */
        int pi = partition(arr, low, high);

        // Recursively sort elements before
        // partition and after partition
        sort(arr, low, pi-1);
        sort(arr, pi+1, high);
    	}
	}
	public static void printArr(int arr[]) {
		for(int i:arr)
			System.out.println(i);
	}
}
