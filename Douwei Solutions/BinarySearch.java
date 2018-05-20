package Douwei;
import java.util.*;
public class BinarySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<a;i++) {
		int v = sc.nextInt();
		int ans = linearSearch(arr,v);
				if(ans!=-1)
					System.out.println(ans+1);
				else
					System.out.println(0);
	}
}
public static int linearSearch(int[] list, int key) {
	   for (int i = 0; i < list.length; i++)
	       if (key == list[i])
	           return i;  //found it! so we immediately exit the method
	   return -1;     //didn't find it, but we have to return something
	}
}
