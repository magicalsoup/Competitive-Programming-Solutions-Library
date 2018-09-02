package Implementations;
import java.util.*;
public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
    	Arrays.sort(arr);
    	int n = arr.length;
    	int curr = 0;
    	int min = arr[0];
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(n);
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==min) {
    			curr++;
    		}
    		else {
    			n -=curr;
    			curr = 1;
    			min = arr[i];
    			list.add(n);
    		}
    	}
    	int a[] = new int[list.size()];
    	for(int i = 0; i < list.size(); i++)
    		a[i] = list.get(i);
    	return a;
    }
    
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i = 0; i < n; i++)
    		arr[i] = sc.nextInt();
    	arr = cutTheSticks(arr);
    	for(Integer i: arr)
    		System.out.println(i);
    	sc.close();
    }
}
